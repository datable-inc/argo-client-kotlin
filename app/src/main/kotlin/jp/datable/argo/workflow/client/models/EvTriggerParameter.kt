package jp.datable.argo.workflow.client.models

data class EvTriggerParameter(
    val dest: String?,
    val operation: String?,
    val src: EvTriggerParameterSource?
)
