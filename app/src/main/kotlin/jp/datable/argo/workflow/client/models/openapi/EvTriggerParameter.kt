package jp.datable.argo.workflow.client.models.openapi

data class EvTriggerParameter(
    val dest: String? = null,
    val operation: String? = null,
    val src: EvTriggerParameterSource? = null
)
