package jp.datable.argo.workflow.client.models.openapi

data class WfClusterWorkflowTemplateLintRequest(
    val createOptions: MetaCreateOptions? = null,
    val template: WfClusterWorkflowTemplate? = null
)
