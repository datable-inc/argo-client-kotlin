package jp.datable.argo.workflow.client.models.openapi

data class WfWorkflowList(
    val items: List<WfWorkflow>,
    val metadata: MetaListMeta,
    val apiVersion: String? = null,
    val kind: String? = null
)
