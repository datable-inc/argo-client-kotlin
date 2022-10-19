package jp.datable.argo.workflow.client.models

data class EvMQTTEventSource(
    val clientId: String? = null,
    val connectionBackoff: EvBackoff? = null,
    val filter: EvEventSourceFilter? = null,
    val jsonBody: Boolean? = null,
    val metadata: Map<String, String>? = null,
    val tls: EvTLSConfig? = null,
    val topic: String? = null,
    val url: String? = null
)
