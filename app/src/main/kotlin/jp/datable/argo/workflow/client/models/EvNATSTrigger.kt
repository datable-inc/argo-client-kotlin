package jp.datable.argo.workflow.client.models

data class EvNATSTrigger(
    val parameters: List<EvTriggerParameter>?,
    val payload: List<EvTriggerParameter>?,
    val subject: String?,
    val tls: EvTLSConfig?,
    val url: String?
)
