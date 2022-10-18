package jp.datable.argo.workflow.client.models

data class WfWorkflowResubmitRequest(
    val memoized: Boolean?,
    val name: String?,
    val namespace: String?,
    val parameters: List<String>?
)
