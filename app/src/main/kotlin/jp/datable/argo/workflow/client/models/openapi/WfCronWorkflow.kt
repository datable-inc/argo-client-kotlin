package jp.datable.argo.workflow.client.models.openapi

data class WfCronWorkflow(
    val metadata: MetaObjectMeta,
    val spec: WfCronWorkflowSpec,
    val apiVersion: String? = null,
    val kind: String? = null,
    val status: WfCronWorkflowStatus? = null
)
