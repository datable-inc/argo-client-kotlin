package jp.datable.argo.workflow.client.models

data class StreamResultOfCoreEvent(
    val error: GrpcgatewayruntimeStreamError?,
    val result: CoreEvent?
)
