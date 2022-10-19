package jp.datable.argo.workflow.client.models

data class WfWorkflow(
    val metadata: MetaObjectMeta,
    val spec: WfWorkflowSpec,
    val apiVersion: String? = null,
    val kind: String? = null,
    val status: WfWorkflowStatus? = null
)
