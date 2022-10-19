package jp.datable.argo.workflow.client.models

data class WfWorkflowSubmitRequest(
    val namespace: String? = null,
    val resourceKind: String? = null,
    val resourceName: String? = null,
    val submitOptions: WfSubmitOpts? = null
)
