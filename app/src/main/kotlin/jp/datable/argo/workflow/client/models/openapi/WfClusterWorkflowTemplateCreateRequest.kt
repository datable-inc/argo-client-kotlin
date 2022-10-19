package jp.datable.argo.workflow.client.models.openapi

data class WfClusterWorkflowTemplateCreateRequest(
    val createOptions: MetaCreateOptions? = null,
    val template: WfClusterWorkflowTemplate? = null
)
