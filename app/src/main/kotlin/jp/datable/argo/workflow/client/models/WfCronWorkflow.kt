package jp.datable.argo.workflow.client.models

data class WfCronWorkflow(
    val metadata: MetaObjectMeta,
    val spec: WfCronWorkflowSpec,
    val apiVersion: String?,
    val kind: String?,
    val status: WfCronWorkflowStatus?
)
