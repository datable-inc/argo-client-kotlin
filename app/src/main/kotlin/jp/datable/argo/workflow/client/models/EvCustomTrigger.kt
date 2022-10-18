package jp.datable.argo.workflow.client.models

data class EvCustomTrigger(
    val certSecret: CoreSecretKeySelector?,
    val parameters: List<EvTriggerParameter>?,
    val payload: List<EvTriggerParameter>?,
    val secure: Boolean?,
    val serverNameOverride: String?,
    val serverURL: String?,
    val spec: Map<String, String>?
)
