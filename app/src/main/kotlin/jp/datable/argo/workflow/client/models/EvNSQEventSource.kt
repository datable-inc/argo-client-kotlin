package jp.datable.argo.workflow.client.models

data class EvNSQEventSource(
    val channel: String? = null,
    val connectionBackoff: EvBackoff? = null,
    val filter: EvEventSourceFilter? = null,
    val hostAddress: String? = null,
    val jsonBody: Boolean? = null,
    val metadata: Map<String, String>? = null,
    val tls: EvTLSConfig? = null,
    val topic: String? = null
)
