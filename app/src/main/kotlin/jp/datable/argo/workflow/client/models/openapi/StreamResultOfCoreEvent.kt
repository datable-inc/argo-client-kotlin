package jp.datable.argo.workflow.client.models.openapi

data class StreamResultOfCoreEvent(
    val error: GrpcgatewayruntimeStreamError? = null,
    val result: CoreEvent? = null
)
