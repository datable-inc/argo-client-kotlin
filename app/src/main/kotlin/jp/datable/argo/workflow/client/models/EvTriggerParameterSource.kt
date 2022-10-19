package jp.datable.argo.workflow.client.models

data class EvTriggerParameterSource(
    val contextKey: String? = null,
    val contextTemplate: String? = null,
    val dataKey: String? = null,
    val dataTemplate: String? = null,
    val dependencyName: String? = null,
    val `value`: String? = null
)
