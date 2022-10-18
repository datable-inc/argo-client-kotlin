package jp.datable.argo.workflow.client.models

data class WfResubmitArchivedWorkflowRequest(
    val memoized: Boolean?,
    val name: String?,
    val namespace: String?,
    val parameters: List<String>?,
    val uid: String?
)
