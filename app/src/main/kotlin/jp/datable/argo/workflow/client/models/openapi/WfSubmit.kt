package jp.datable.argo.workflow.client.models.openapi

data class WfSubmit(
    val workflowTemplateRef: WfWorkflowTemplateRef,
    val arguments: WfArguments? = null,
    val metadata: MetaObjectMeta? = null
)
