package jp.datable.argo.workflow.client.apis.eventSourceApi

import com.github.michaelbull.result.Result
import com.github.michaelbull.result.andThen
import jp.datable.argo.workflow.client.apis.BaseApi
import jp.datable.argo.workflow.client.https.HttpClient
import jp.datable.argo.workflow.client.https.HttpResponse
import jp.datable.argo.workflow.client.models.openapi.EvEventSource
import jp.datable.argo.workflow.client.models.openapi.EvEventSourceList
import jp.datable.argo.workflow.client.models.openapi.EventsourceUpdateEventSourceRequest
import okhttp3.Call
import org.springframework.http.HttpMethod

class EventSourceApi(httpClient: HttpClient) : BaseApi(httpClient) {
    companion object {
        private const val EVENT_SOURCES_PATH = "event-sources"
    }

    /** GET /api/v1/event-sources/{namespace} */
    fun getEventSources(namespace: String): Result<HttpResponse<EvEventSourceList>, Exception> {
        return getEventSourcesWithHttpInfo(namespace)
    }

    private fun getEventSourcesCall(namespace: String): Result<Call, Exception> {
        val path = buildEventSourcesPath(namespace)
        return httpClient.buildCall(path, HttpMethod.GET, null, null)
    }

    private fun getEventSourcesWithHttpInfo(
        namespace: String
    ): Result<HttpResponse<EvEventSourceList>, Exception> {
        return getEventSourcesCall(namespace).andThen {
            httpClient.execute(it, EvEventSourceList::class.java)
        }
    }

    /** PUT /api/v1/event-sources/{namespace}/{name} */
    fun updateEventSource(
        namespace: String,
        name: String,
        body: EventsourceUpdateEventSourceRequest
    ): Result<HttpResponse<EvEventSource>, Exception> {
        return updateEventSourceWithHttpInfo(namespace, name, body)
    }

    private fun updateEventSourcesCall(
        namespace: String,
        name: String,
        body: EventsourceUpdateEventSourceRequest
    ): Result<Call, Exception> {
        val path = buildEventSourcePath(namespace, name)
        return httpClient.buildCall(path, HttpMethod.PUT, null, body)
    }

    private fun updateEventSourceWithHttpInfo(
        namespace: String,
        name: String,
        body: EventsourceUpdateEventSourceRequest
    ): Result<HttpResponse<EvEventSource>, Exception> {
        return updateEventSourcesCall(namespace, name, body).andThen {
            httpClient.execute(it, EvEventSource::class.java)
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

    private fun buildEventSourcePath(namespace: String, name: String): String {
        return StringBuilder()
            .also {
                it.append(BASE_PATH)
                it.append(EVENT_SOURCES_PATH)
                it.append("/")
                it.append(namespace)
                it.append("/")
                it.append(name)
            }
            .toString()
    }
}
