package jp.datable.argo.workflow.client.models.openapi

data class EventsourceLogEntry(
    val eventName: String? = null,
    val eventSourceName: String? = null,
    val eventSourceType: String? = null,
    val level: String? = null,
    val msg: String? = null,
    val namespace: String? = null,
    val time: String? = null
)
