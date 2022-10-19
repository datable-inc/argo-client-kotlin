package jp.datable.argo.workflow.client.models.openapi

data class StreamResultOfEventsourceEventSourceWatchEvent(
    val error: GrpcgatewayruntimeStreamError? = null,
    val result: EventsourceEventSourceWatchEvent? = null
)
