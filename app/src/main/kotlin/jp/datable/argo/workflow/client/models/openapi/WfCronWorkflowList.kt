package jp.datable.argo.workflow.client.models.openapi

data class WfCronWorkflowList(
    val items: List<WfCronWorkflow>,
    val metadata: MetaListMeta,
    val apiVersion: String? = null,
    val kind: String? = null
)
