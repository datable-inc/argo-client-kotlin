package jp.datable.argo.workflow.client.models

data class WfLifecycleHook(
    val arguments: WfArguments? = null,
    val expression: String? = null,
    val template: String? = null,
    val templateRef: WfTemplateRef? = null
)
