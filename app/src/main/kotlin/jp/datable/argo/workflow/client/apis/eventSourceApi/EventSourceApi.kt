package jp.datable.argo.workflow.client.apis.eventSourceApi

import com.github.michaelbull.result.Result
import com.github.michaelbull.result.andThen
import jp.datable.argo.workflow.client.apis.BaseApi
import jp.datable.argo.workflow.client.https.HttpClient
import jp.datable.argo.workflow.client.https.HttpResponse
import jp.datable.argo.workflow.client.models.EvEventSourceList
import okhttp3.Call
import org.springframework.http.HttpMethod

class EventSourceApi(httpClient: HttpClient) : BaseApi(httpClient) {
    companion object {
        private const val EVENT_SOURCES_PATH = "event-sources"
    }

    /** GET /api/v1/event-sources/{namespace} */
    fun getEventSources(): Result<HttpResponse<EvEventSourceList>, Exception> {
        return getEventSourcesWithHttpInfo()
    }

    private fun getEventSourcesCall(): Result<Call, Exception> {
        val path = buildEventSourcesPath()
        return httpClient.buildCall(path, HttpMethod.GET, null, null)
    }

    private fun getEventSourcesWithHttpInfo(): Result<HttpResponse<EvEventSourceList>, Exception> {
        return getEventSourcesCall().andThen {
            httpClient.execute(it, EvEventSourceList::class.java)
        }
    }

    private fun buildEventSourcesPath(): String {
        return StringBuilder()
            .also {
                it.append(BASE_PATH)
                it.append(EVENT_SOURCES_PATH)
                it.append("/")
            }
            .toString()
    }
}
