package jp.datable.argo.workflow.client.models

data class WfWorkflowStep(
    val arguments: WfArguments? = null,
    val continueOn: WfContinueOn? = null,
    val hooks: Map<String, WfLifecycleHook>? = null,
    val `inline`: WfTemplate? = null,
    val name: String? = null,
    val onExit: String? = null,
    val template: String? = null,
    val templateRef: WfTemplateRef? = null,
    val `when`: String? = null,
    val withItems: List<Any>? = null,
    val withParam: String? = null,
    val withSequence: WfSequence? = null
)
