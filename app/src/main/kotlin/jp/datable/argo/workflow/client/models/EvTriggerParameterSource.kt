package jp.datable.argo.workflow.client.models

data class EvTriggerParameterSource(
    val contextKey: String?,
    val contextTemplate: String?,
    val dataKey: String?,
    val dataTemplate: String?,
    val dependencyName: String?,
    val `value`: String?
)
