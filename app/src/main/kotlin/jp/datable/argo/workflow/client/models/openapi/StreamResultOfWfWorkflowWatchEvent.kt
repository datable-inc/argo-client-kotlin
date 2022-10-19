package jp.datable.argo.workflow.client.models.openapi

data class StreamResultOfWfWorkflowWatchEvent(
    val error: GrpcgatewayruntimeStreamError? = null,
    val result: WfWorkflowWatchEvent? = null
)
