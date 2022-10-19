package jp.datable.argo.workflow.client.models

data class StreamResultOfCoreEvent(
    val error: GrpcgatewayruntimeStreamError? = null,
    val result: CoreEvent? = null
)
