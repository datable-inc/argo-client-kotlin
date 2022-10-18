package jp.datable.argo.workflow.client.models

data class WfWorkflowTemplateLintRequest(
    val createOptions: MetaCreateOptions?,
    val namespace: String?,
    val template: WfWorkflowTemplate?
)
