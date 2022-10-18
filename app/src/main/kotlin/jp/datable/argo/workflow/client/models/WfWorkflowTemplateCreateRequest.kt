package jp.datable.argo.workflow.client.models

data class WfWorkflowTemplateCreateRequest(
    val createOptions: MetaCreateOptions?,
    val namespace: String?,
    val template: WfWorkflowTemplate?
)
