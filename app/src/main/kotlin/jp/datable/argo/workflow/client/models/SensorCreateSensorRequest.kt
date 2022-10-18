package jp.datable.argo.workflow.client.models

data class SensorCreateSensorRequest(
    val createOptions: MetaCreateOptions?,
    val namespace: String?,
    val sensor: EvSensor?
)
