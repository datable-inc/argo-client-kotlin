package jp.datable.argo.workflow.client.models

data class WfWorkflowResumeRequest(
    val name: String? = null,
    val namespace: String? = null,
    val nodeFieldSelector: String? = null
)
