package jp.datable.argo.workflow.client.models

data class WfLifecycleHook(
    val arguments: WfArguments?,
    val expression: String?,
    val template: String?,
    val templateRef: WfTemplateRef?
)
