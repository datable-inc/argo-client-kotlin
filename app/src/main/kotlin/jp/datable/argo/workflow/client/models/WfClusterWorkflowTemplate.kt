package jp.datable.argo.workflow.client.models

data class WfClusterWorkflowTemplate(
    val metadata: MetaObjectMeta,
    val spec: WfWorkflowSpec,
    val apiVersion: String?,
    val kind: String?
)
