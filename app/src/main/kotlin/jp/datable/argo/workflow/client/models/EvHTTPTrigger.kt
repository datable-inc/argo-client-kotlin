package jp.datable.argo.workflow.client.models

data class EvHTTPTrigger(
    val basicAuth: EvBasicAuth?,
    val headers: Map<String, String>?,
    val method: String?,
    val parameters: List<EvTriggerParameter>?,
    val payload: List<EvTriggerParameter>?,
    val secureHeaders: List<EvSecureHeader>?,
    val timeout: String?,
    val tls: EvTLSConfig?,
    val url: String?
)
