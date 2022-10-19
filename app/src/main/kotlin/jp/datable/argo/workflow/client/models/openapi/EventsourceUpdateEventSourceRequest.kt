package jp.datable.argo.workflow.client.models.openapi

data class EventsourceUpdateEventSourceRequest(
    val eventSource: EvEventSource? = null,
    val name: String? = null,
    val namespace: String? = null
)
