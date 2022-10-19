package jp.datable.argo.workflow.client.models.openapi

data class WfClusterWorkflowTemplateUpdateRequest(
    val name: String? = null,
    val template: WfClusterWorkflowTemplate? = null
)
