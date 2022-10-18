package jp.datable.argo.workflow.client.models

data class WfWorkflowSubmitRequest(
    val namespace: String?,
    val resourceKind: String?,
    val resourceName: String?,
    val submitOptions: WfSubmitOpts?
)
