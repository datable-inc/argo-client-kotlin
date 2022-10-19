package jp.datable.argo.workflow.client.models

data class StreamResultOfEventsourceLogEntry(
    val error: GrpcgatewayruntimeStreamError? = null,
    val result: EventsourceLogEntry? = null
)
