package jp.datable.argo.workflow.client.models.openapi

data class EventsourceCreateEventSourceRequest(
    val eventSource: EvEventSource? = null,
    val namespace: String? = null
)
