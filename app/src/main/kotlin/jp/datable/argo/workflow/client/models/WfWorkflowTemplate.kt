package jp.datable.argo.workflow.client.models

data class WfWorkflowTemplate(
    val metadata: MetaObjectMeta,
    val spec: WfWorkflowSpec,
    val apiVersion: String?,
    val kind: String?
)
