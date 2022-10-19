package jp.datable.argo.workflow.client.models.openapi

data class SensorCreateSensorRequest(
    val createOptions: MetaCreateOptions? = null,
    val namespace: String? = null,
    val sensor: EvSensor? = null
)
