package jp.datable.argo.workflow.client.models

data class SensorUpdateSensorRequest(
    val name: String? = null,
    val namespace: String? = null,
    val sensor: EvSensor? = null
)
