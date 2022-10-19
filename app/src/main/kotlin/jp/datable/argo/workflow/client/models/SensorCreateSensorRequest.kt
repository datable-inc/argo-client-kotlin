package jp.datable.argo.workflow.client.models

data class SensorCreateSensorRequest(
    val createOptions: MetaCreateOptions? = null,
    val namespace: String? = null,
    val sensor: EvSensor? = null
)
