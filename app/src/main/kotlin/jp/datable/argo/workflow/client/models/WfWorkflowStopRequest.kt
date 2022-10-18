package jp.datable.argo.workflow.client.models

data class WfWorkflowStopRequest(
    val message: String?,
    val name: String?,
    val namespace: String?,
    val nodeFieldSelector: String?
)
