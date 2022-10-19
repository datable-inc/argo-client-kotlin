package jp.datable.argo.workflow.client.models

data class EvWebhookContext(
    val authSecret: CoreSecretKeySelector? = null,
    val endpoint: String? = null,
    val maxPayloadSize: String? = null,
    val metadata: Map<String, String>? = null,
    val method: String? = null,
    val port: String? = null,
    val serverCertSecret: CoreSecretKeySelector? = null,
    val serverKeySecret: CoreSecretKeySelector? = null,
    val url: String? = null
)
