package jp.datable.argo.workflow.client.models

data class EvWebhookContext(
    val authSecret: CoreSecretKeySelector?,
    val endpoint: String?,
    val maxPayloadSize: String?,
    val metadata: Map<String, String>?,
    val method: String?,
    val port: String?,
    val serverCertSecret: CoreSecretKeySelector?,
    val serverKeySecret: CoreSecretKeySelector?,
    val url: String?
)
