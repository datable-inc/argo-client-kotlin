package jp.datable.argo.workflow.client.models.openapi

data class SensorLogEntry(
    val dependencyName: String? = null,
    val eventContext: String? = null,
    val level: String? = null,
    val msg: String? = null,
    val namespace: String? = null,
    val sensorName: String? = null,
    val time: String? = null,
    val triggerName: String? = null
)
