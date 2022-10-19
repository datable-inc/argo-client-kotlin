package jp.datable.argo.workflow.client.models

data class EventsourceUpdateEventSourceRequest(
    val eventSource: EvEventSource? = null,
    val name: String? = null,
    val namespace: String? = null
)
