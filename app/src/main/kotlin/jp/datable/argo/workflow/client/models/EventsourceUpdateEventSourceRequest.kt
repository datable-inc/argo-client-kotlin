package jp.datable.argo.workflow.client.models

data class EventsourceUpdateEventSourceRequest(
    val eventSource: EvEventSource?,
    val name: String?,
    val namespace: String?
)
