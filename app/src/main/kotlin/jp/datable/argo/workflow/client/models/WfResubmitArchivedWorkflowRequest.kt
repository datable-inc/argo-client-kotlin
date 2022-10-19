package jp.datable.argo.workflow.client.models

data class WfResubmitArchivedWorkflowRequest(
    val memoized: Boolean? = null,
    val name: String? = null,
    val namespace: String? = null,
    val parameters: List<String>? = null,
    val uid: String? = null
)
