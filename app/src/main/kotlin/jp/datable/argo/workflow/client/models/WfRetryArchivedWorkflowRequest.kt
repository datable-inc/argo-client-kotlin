package jp.datable.argo.workflow.client.models

data class WfRetryArchivedWorkflowRequest(
    val name: String?,
    val namespace: String?,
    val nodeFieldSelector: String?,
    val parameters: List<String>?,
    val restartSuccessful: Boolean?,
    val uid: String?
)
