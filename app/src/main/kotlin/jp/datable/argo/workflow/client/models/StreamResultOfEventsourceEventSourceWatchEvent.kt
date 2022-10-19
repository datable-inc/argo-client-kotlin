package jp.datable.argo.workflow.client.models

data class StreamResultOfEventsourceEventSourceWatchEvent(
    val error: GrpcgatewayruntimeStreamError? = null,
    val result: EventsourceEventSourceWatchEvent? = null
)
