package jp.datable.argo.workflow.client.models

data class WfWorkflow(
    val metadata: MetaObjectMeta,
    val spec: WfWorkflowSpec,
    val apiVersion: String?,
    val kind: String?,
    val status: WfWorkflowStatus?
)
