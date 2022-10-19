package jp.datable.argo.workflow.client.models.openapi

data class StreamResultOfEventsourceLogEntry(
    val error: GrpcgatewayruntimeStreamError? = null,
    val result: EventsourceLogEntry? = null
)
