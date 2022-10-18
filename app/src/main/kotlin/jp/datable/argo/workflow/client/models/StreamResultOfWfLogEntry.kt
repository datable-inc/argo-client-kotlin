package jp.datable.argo.workflow.client.models

data class StreamResultOfWfLogEntry(
    val error: GrpcgatewayruntimeStreamError?,
    val result: WfLogEntry?
)
