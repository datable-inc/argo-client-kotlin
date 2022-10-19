package jp.datable.argo.workflow.client.models.openapi

data class EvCustomTrigger(
    val certSecret: CoreSecretKeySelector? = null,
    val parameters: List<EvTriggerParameter>? = null,
    val payload: List<EvTriggerParameter>? = null,
    val secure: Boolean? = null,
    val serverNameOverride: String? = null,
    val serverURL: String? = null,
    val spec: Map<String, String>? = null
)
