package jp.datable.argo.workflow.client.models

data class EvNSQEventSource(
    val channel: String?,
    val connectionBackoff: EvBackoff?,
    val filter: EvEventSourceFilter?,
    val hostAddress: String?,
    val jsonBody: Boolean?,
    val metadata: Map<String, String>?,
    val tls: EvTLSConfig?,
    val topic: String?
)
