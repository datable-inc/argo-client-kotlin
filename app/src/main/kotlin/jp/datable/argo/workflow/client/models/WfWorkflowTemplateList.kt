package jp.datable.argo.workflow.client.models

data class WfWorkflowTemplateList(
    val items: List<WfWorkflowTemplate>,
    val metadata: MetaListMeta,
    val apiVersion: String?,
    val kind: String?
)