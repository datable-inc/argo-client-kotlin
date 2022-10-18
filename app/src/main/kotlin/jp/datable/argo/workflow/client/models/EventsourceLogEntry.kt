package jp.datable.argo.workflow.client.models

data class EventsourceLogEntry(
    val eventName: String?,
    val eventSourceName: String?,
    val eventSourceType: String?,
    val level: String?,
    val msg: String?,
    val namespace: String?,
    val time: java.time.OffsetDateTime?
)
