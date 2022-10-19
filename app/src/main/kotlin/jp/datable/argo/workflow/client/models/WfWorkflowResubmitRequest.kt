package jp.datable.argo.workflow.client.models

data class WfWorkflowResubmitRequest(
    val memoized: Boolean? = null,
    val name: String? = null,
    val namespace: String? = null,
    val parameters: List<String>? = null
)
