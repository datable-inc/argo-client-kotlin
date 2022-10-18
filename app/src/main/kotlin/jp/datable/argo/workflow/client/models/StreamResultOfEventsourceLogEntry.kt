package jp.datable.argo.workflow.client.models

data class StreamResultOfEventsourceLogEntry(
    val error: GrpcgatewayruntimeStreamError?,
    val result: EventsourceLogEntry?
)
