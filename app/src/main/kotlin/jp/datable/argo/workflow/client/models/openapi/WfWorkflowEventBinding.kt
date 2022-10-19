package jp.datable.argo.workflow.client.models.openapi

data class WfWorkflowEventBinding(
    val metadata: MetaObjectMeta,
    val spec: WfWorkflowEventBindingSpec,
    val apiVersion: String? = null,
    val kind: String? = null
)
