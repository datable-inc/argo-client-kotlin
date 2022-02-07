package jp.datable.argo.workflow.client.https

import com.github.michaelbull.result.Err
import com.github.michaelbull.result.Ok
import com.github.michaelbull.result.Result
import com.google.gson.Gson
import okhttp3.Call
import okhttp3.HttpUrl
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response
import org.springframework.http.HttpMethod
import java.lang.reflect.Type

class HttpClient private constructor(
    private val endpointHost: String,
    private val header: HttpHeader,
    private val httpClient: OkHttpClient
) {
    companion object {
        fun connect(endpointHost: String, header: HttpHeader): HttpClient {
            return HttpClient(
                endpointHost,
                header,
                OkHttpClient.Builder().build()
            )
        }
    }

    fun <T> execute(call: Call, returnType: Type): Result<HttpResponse<T>, Exception> {
        return try {
            val response = call.execute()
            val data = handleResponse<T>(response, returnType)
            Ok(HttpResponse(response.code, response.headers.toMultimap(), data))
        } catch (e: Exception) {
            Err(e)
        }
    }

    fun <T> buildCall(
        path: String,
        method: HttpMethod,
        queryParams: QueryParams?,
        body: T
    ): Result<Call, Exception> {
        return try {
            Ok(
                buildRequest(path, method, queryParams, body).let {
                    httpClient.newCall(it)
                }
            )
        } catch (e: Exception) {
            Err(e)
        }
    }

    private fun <T> buildRequest(
        path: String,
        method: HttpMethod,
        queryParams: QueryParams?,
        body: T
    ): Request {
        val url = buildUrl(path, queryParams)
        val requestBody = serialize(body = body, contentType = "application/json")
        val requestBuilder = Request
            .Builder()
            .url(url)
            .headers(header.toOkHttpHeader())

        return when (method) {
            HttpMethod.GET -> requestBuilder.get().build()
            HttpMethod.POST -> requestBuilder.post(requestBody).build()
            HttpMethod.PUT -> requestBuilder.put(requestBody).build()
            HttpMethod.DELETE -> requestBuilder.delete(requestBody).build()
            else -> throw Exception("${method.name} is not supported.")
        }
    }

    // TODO: should be handled "http" schema with verifying ssl certificate is false
    private fun buildUrl(path: String, queryParams: QueryParams?): HttpUrl {
        return HttpUrl.Builder()
            .scheme("https")
            .host(endpointHost)
            .addPathSegments(path)
            .also { builder ->
                queryParams?.forEach {
                    builder.addQueryParameter(it.first, it.second)
                }
            }.build()
    }

    private fun <T> deserialize(response: Response, returnType: Type): T {
        return Gson().fromJson(requireNotNull(response.body) { "body should not be null" }.string(), returnType)
    }

    private fun <T> serialize(body: T, contentType: String): RequestBody {
        return Gson().toJson(body).let {
            it.toRequestBody(contentType.toMediaTypeOrNull())
        }
    }

    private fun <T> handleResponse(response: Response, returnType: Type): T {
        if (response.isSuccessful) {
            return deserialize(response, returnType)
        } else {
            throw HttpException(
                response.code,
                response.headers.toMultimap(),
                requireNotNull(response.body) { "Something was happened!" }.string()
            )
        }
    }
}
