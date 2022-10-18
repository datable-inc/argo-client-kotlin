package jp.datable.argo.workflow.client.models

data class WfWorkflowResumeRequest(
    val name: String?,
    val namespace: String?,
    val nodeFieldSelector: String?
)
