package jp.datable.argo.workflow.client.models.openapi

data class EvNATSTrigger(
    val parameters: List<EvTriggerParameter>? = null,
    val payload: List<EvTriggerParameter>? = null,
    val subject: String? = null,
    val tls: EvTLSConfig? = null,
    val url: String? = null
)
