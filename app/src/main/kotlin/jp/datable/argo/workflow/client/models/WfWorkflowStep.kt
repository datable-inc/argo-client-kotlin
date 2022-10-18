package jp.datable.argo.workflow.client.models

data class WfWorkflowStep(
    val arguments: WfArguments?,
    val continueOn: WfContinueOn?,
    val hooks: Map<String, WfLifecycleHook>?,
    val `inline`: WfTemplate?,
    val name: String?,
    val onExit: String?,
    val template: String?,
    val templateRef: WfTemplateRef?,
    val `when`: String?,
    val withItems: List<Any>?,
    val withParam: String?,
    val withSequence: WfSequence?
)
