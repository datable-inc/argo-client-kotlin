package jp.datable.argo.workflow.client.models

data class SensorLogEntry(
    val dependencyName: String?,
    val eventContext: String?,
    val level: String?,
    val msg: String?,
    val namespace: String?,
    val sensorName: String?,
    val time: java.time.OffsetDateTime?,
    val triggerName: String?
)
