package jp.datable.argo.workflow.client.models.openapi

data class WfWorkflowSetRequest(
    val message: String? = null,
    val name: String? = null,
    val namespace: String? = null,
    val nodeFieldSelector: String? = null,
    val outputParameters: String? = null,
    val phase: String? = null
)
