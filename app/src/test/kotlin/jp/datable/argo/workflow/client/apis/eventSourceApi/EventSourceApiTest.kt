package jp.datable.argo.workflow.client.apis.eventSourceApi

import ConnectionSetting
import com.github.michaelbull.result.Err
import com.github.michaelbull.result.Ok
import jp.datable.argo.workflow.client.https.HttpClient
import jp.datable.argo.workflow.client.https.HttpHeader
import org.junit.Test

internal class EventSourceApiTest {

    @Test
    fun getEventSources() {
        val setting = ConnectionSetting.get()

        val httpClient =
            HttpClient.connect(setting.host, HttpHeader(mapOf("Authorization" to setting.bearerToken)))
        when (val result = EventSourceApi(httpClient).getEventSources()) {
            is Ok -> {
                println(result.value)
            }
            is Err -> {
                println(result.error)
            }
        }
    }
}
