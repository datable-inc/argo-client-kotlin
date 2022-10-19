package jp.datable.argo.workflow.client.models

data class WfWorkflowRetryRequest(
    val name: String? = null,
    val namespace: String? = null,
    val nodeFieldSelector: String? = null,
    val parameters: List<String>? = null,
    val restartSuccessful: Boolean? = null
)
