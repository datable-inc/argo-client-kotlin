package jp.datable.argo.workflow.client.models.openapi

data class Webhook(
    val authSecret: AuthSecret,
    val endpoint: String,
    val metadata: Map<String, String>?,
    val method: String,
    val port: String,
    val serverCertSecret: SecretKeySelector,
    val serverKeySecret: SecretKeySelector,
    val url: String
)
