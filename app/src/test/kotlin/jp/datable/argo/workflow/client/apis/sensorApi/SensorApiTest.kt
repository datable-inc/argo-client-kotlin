package jp.datable.argo.workflow.client.apis.sensorApi

import com.github.michaelbull.result.Err
import com.github.michaelbull.result.Ok
import jp.datable.argo.workflow.client.https.HttpClient
import jp.datable.argo.workflow.client.https.HttpHeader
import jp.datable.argo.workflow.client.models.openapi.EvSensor
import jp.datable.argo.workflow.client.models.openapi.MetaObjectMeta
import jp.datable.argo.workflow.client.models.openapi.SensorCreateSensorRequest
import org.junit.Ignore
import org.junit.Test

@Ignore("This test is ignored because it requires a real Argo server.")
internal class SensorApiTest {

    @Test
    fun createSensor() {
        val setting = ConnectionSetting.get()

        val httpClient =
            HttpClient.connect(setting.host, HttpHeader(mapOf("Authorization" to setting.bearerToken)))

        val body =
            SensorCreateSensorRequest(
                namespace = setting.eventSourceNamespace,
                sensor = EvSensor(metadata = MetaObjectMeta(name = setting.sensorName))
            )

        when (val result = SensorApi(httpClient).createSensor(setting.eventSourceNamespace, body)) {
            is Ok -> {
                println(result.value)
            }
            is Err -> {
                println(result.error)
            }
        }
    }
}
