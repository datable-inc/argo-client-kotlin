package jp.datable.argo.workflow.client.models.openapi

data class WfClusterWorkflowTemplateList(
    val items: List<WfClusterWorkflowTemplate>,
    val metadata: MetaListMeta,
    val apiVersion: String? = null,
    val kind: String? = null
)
