package jp.datable.argo.workflow.client.models

data class WfWorkflowTemplateCreateRequest(
    val createOptions: MetaCreateOptions? = null,
    val namespace: String? = null,
    val template: WfWorkflowTemplate? = null
)
