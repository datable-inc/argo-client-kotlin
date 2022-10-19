package jp.datable.argo.workflow.client.models

data class EvHTTPTrigger(
    val basicAuth: EvBasicAuth? = null,
    val headers: Map<String, String>? = null,
    val method: String? = null,
    val parameters: List<EvTriggerParameter>? = null,
    val payload: List<EvTriggerParameter>? = null,
    val secureHeaders: List<EvSecureHeader>? = null,
    val timeout: String? = null,
    val tls: EvTLSConfig? = null,
    val url: String? = null
)
