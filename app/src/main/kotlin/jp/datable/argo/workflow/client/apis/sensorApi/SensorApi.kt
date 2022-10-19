package jp.datable.argo.workflow.client.apis.sensorApi

import com.github.michaelbull.result.Result
import com.github.michaelbull.result.andThen
import jp.datable.argo.workflow.client.apis.BaseApi
import jp.datable.argo.workflow.client.https.HttpClient
import jp.datable.argo.workflow.client.https.HttpResponse
import jp.datable.argo.workflow.client.models.openapi.EvSensor
import jp.datable.argo.workflow.client.models.openapi.SensorCreateSensorRequest
import okhttp3.Call
import org.springframework.http.HttpMethod

class SensorApi(httpClient: HttpClient) : BaseApi(httpClient) {
    companion object {
        private const val SENSORS_PATH = "sensors"
    }

    /** POST /api/v1/sensors/{namespace}/ */
    fun createSensor(
        namespace: String,
        body: SensorCreateSensorRequest
    ): Result<HttpResponse<EvSensor>, Exception> {
        return createSensorWithHttpInfo(namespace, body)
    }

    private fun createSensorCall(
        namespace: String,
        body: SensorCreateSensorRequest
    ): Result<Call, Exception> {
        val path = buildSensorsPath(namespace)
        return httpClient.buildCall(path, HttpMethod.POST, null, body)
    }

    private fun createSensorWithHttpInfo(
        namespace: String,
        body: SensorCreateSensorRequest
    ): Result<HttpResponse<EvSensor>, Exception> {
        return createSensorCall(namespace, body).andThen {
            httpClient.execute(it, EvSensor::class.java)
        }
    }

    private fun buildSensorsPath(namespace: String): String {
        return StringBuilder()
            .also {
                it.append(BASE_PATH)
                it.append(SENSORS_PATH)
                it.append("/")
                it.append(namespace)
            }
            .toString()
    }
}
