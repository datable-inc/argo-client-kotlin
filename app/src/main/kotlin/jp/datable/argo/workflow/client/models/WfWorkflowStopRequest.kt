package jp.datable.argo.workflow.client.models

data class WfWorkflowStopRequest(
    val message: String? = null,
    val name: String? = null,
    val namespace: String? = null,
    val nodeFieldSelector: String? = null
)
