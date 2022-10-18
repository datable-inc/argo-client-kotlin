package jp.datable.argo.workflow.client.models

data class StreamResultOfEventsourceEventSourceWatchEvent(
    val error: GrpcgatewayruntimeStreamError?,
    val result: EventsourceEventSourceWatchEvent?
)
