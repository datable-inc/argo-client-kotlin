package jp.datable.argo.workflow.client.apis.eventSourceApi

import ConnectionSetting
import com.github.michaelbull.result.Err
import com.github.michaelbull.result.Ok
import jp.datable.argo.workflow.client.https.HttpClient
import jp.datable.argo.workflow.client.https.HttpHeader
import jp.datable.argo.workflow.client.models.EvEventSource
import jp.datable.argo.workflow.client.models.EventsourceUpdateEventSourceRequest
import jp.datable.argo.workflow.client.models.MetaObjectMeta
import org.junit.Ignore
import org.junit.Test

@Ignore("This test is ignored because it requires a real Argo server.")
internal class EventSourceApiTest {

    @Test
    fun getEventSources() {
        val setting = ConnectionSetting.get()

        val httpClient =
            HttpClient.connect(setting.host, HttpHeader(mapOf("Authorization" to setting.bearerToken)))
        when (val result = EventSourceApi(httpClient).getEventSources(setting.eventSourceNamespace)) {
            is Ok -> {
                println(result.value)
            }
            is Err -> {
                println(result.error)
            }
        }
    }

    @Test
    fun updateEventSource() {
        val setting = ConnectionSetting.get()

        val httpClient =
            HttpClient.connect(setting.host, HttpHeader(mapOf("Authorization" to setting.bearerToken)))

        val eventSources =
            when (
                val result =
                    EventSourceApi(httpClient).getEventSources(setting.eventSourceNamespace)
            ) {
                is Ok -> result.value
                is Err -> throw Exception(result.error)
            }

        val resourceVersion =
            eventSources.data.items
                ?.find { item -> item.metadata?.name == setting.eventSourceName }
                ?.metadata
                ?.resourceVersion

        val body =
            EventsourceUpdateEventSourceRequest(
                eventSource =
                EvEventSource(
                    metadata =
                    MetaObjectMeta(
                        name = setting.eventSourceName,
                        namespace = setting.eventSourceNamespace,
                        resourceVersion = resourceVersion,
                    ),
                ),
                name = setting.eventSourceName,
                namespace = setting.eventSourceNamespace
            )

        when (
            val result =
                EventSourceApi(httpClient)
                    .updateEventSource(setting.eventSourceNamespace, setting.eventSourceName, body)
        ) {
            is Ok -> {
                println(result.value)
            }
            is Err -> {
                println(result.error)
            }
        }
    }
}
