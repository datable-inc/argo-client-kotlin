package jp.datable.argo.workflow.client.models

data class WfWorkflowEventBindingList(
    val items: List<WfWorkflowEventBinding>,
    val metadata: MetaListMeta,
    val apiVersion: String? = null,
    val kind: String? = null
)
