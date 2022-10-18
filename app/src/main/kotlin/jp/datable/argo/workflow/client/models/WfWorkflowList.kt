package jp.datable.argo.workflow.client.models

data class WfWorkflowList(
    val items: List<WfWorkflow>,
    val metadata: MetaListMeta,
    val apiVersion: String?,
    val kind: String?
)
