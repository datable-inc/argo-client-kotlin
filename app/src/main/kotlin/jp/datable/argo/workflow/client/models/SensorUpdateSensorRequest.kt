package jp.datable.argo.workflow.client.models

data class SensorUpdateSensorRequest(
    val name: String?,
    val namespace: String?,
    val sensor: EvSensor?
)