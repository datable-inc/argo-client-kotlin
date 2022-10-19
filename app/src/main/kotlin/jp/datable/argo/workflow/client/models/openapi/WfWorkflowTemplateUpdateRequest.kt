package jp.datable.argo.workflow.client.models.openapi

data class WfWorkflowTemplateUpdateRequest(
    val name: String? = null,
    val namespace: String? = null,
    val template: WfWorkflowTemplate? = null
)
