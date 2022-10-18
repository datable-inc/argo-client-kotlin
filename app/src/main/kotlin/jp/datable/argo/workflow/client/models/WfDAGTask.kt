package jp.datable.argo.workflow.client.models

data class WfDAGTask(
    val name: String,
    val arguments: WfArguments?,
    val continueOn: WfContinueOn?,
    val dependencies: List<String>?,
    val depends: String?,
    val hooks: Map<String, WfLifecycleHook>?,
    val `inline`: WfTemplate?,
    val onExit: String?,
    val template: String?,
    val templateRef: WfTemplateRef?,
    val `when`: String?,
    val withItems: List<Any>?,
    val withParam: String?,
    val withSequence: WfSequence?
)
