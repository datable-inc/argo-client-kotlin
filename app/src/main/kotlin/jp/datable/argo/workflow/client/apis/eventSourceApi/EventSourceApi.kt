package jp.datable.argo.workflow.client.apis.eventSourceApi

import com.github.michaelbull.result.Result
import com.github.michaelbull.result.andThen
import jp.datable.argo.workflow.client.apis.BaseApi
import jp.datable.argo.workflow.client.https.HttpClient
import jp.datable.argo.workflow.client.https.HttpResponse
import jp.datable.argo.workflow.client.models.EventSources
import okhttp3.Call
import org.springframework.http.HttpMethod

class EventSourceApi(httpClient: HttpClient) : BaseApi(httpClient) {
    companion object {
        private const val EVENT_SOURCES_PATH = "event-sources"
    }

    /** GET /api/v1/event-sources/{namespace} */
    fun getEventSources(
        namespace: String,
    ): Result<HttpResponse<EventSources>, Exception> {
        return getEventSourcesWithHttpInfo(namespace)
    }

    private fun getEventSourcesCall(namespace: String): Result<Call, Exception> {
        val path = buildEventSourcesPath(namespace)
        return httpClient.buildCall(path, HttpMethod.GET, null, null)
    }

    private fun getEventSourcesWithHttpInfo(
        namespace: String,
    ): Result<HttpResponse<EventSources>, Exception> {
        return getEventSourcesCall(namespace).andThen {
            httpClient.execute(it, EventSources::class.java)
        }
    }

    private fun buildEventSourcesPath(namespace: String): String {
        return StringBuilder()
            .also {
                it.append(BASE_PATH)
                it.append(EVENT_SOURCES_PATH)
                it.append("/")
                it.append(namespace)
            }
            .toString()
    }
}
