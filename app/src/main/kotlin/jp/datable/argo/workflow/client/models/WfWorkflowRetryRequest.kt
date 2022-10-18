package jp.datable.argo.workflow.client.models

data class WfWorkflowRetryRequest(
    val name: String?,
    val namespace: String?,
    val nodeFieldSelector: String?,
    val parameters: List<String>?,
    val restartSuccessful: Boolean?
)
