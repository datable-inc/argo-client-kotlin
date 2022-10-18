package jp.datable.argo.workflow.client.models

data class WfNodeResult(
    val message: String?,
    val outputs: WfOutputs?,
    val phase: String?,
    val progress: String?
)
