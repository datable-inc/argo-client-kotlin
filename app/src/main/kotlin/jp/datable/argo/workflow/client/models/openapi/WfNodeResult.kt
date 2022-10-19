package jp.datable.argo.workflow.client.models.openapi

data class WfNodeResult(
    val message: String? = null,
    val outputs: WfOutputs? = null,
    val phase: String? = null,
    val progress: String? = null
)
