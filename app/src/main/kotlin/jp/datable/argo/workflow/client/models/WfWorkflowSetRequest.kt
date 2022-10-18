package jp.datable.argo.workflow.client.models

data class WfWorkflowSetRequest(
    val message: String?,
    val name: String?,
    val namespace: String?,
    val nodeFieldSelector: String?,
    val outputParameters: String?,
    val phase: String?
)
