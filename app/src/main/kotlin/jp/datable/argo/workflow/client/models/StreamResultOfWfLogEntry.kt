package jp.datable.argo.workflow.client.models

data class StreamResultOfWfLogEntry(
    val error: GrpcgatewayruntimeStreamError? = null,
    val result: WfLogEntry? = null
)
