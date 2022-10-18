package jp.datable.argo.workflow.client.models

data class EvMQTTEventSource(
    val clientId: String?,
    val connectionBackoff: EvBackoff?,
    val filter: EvEventSourceFilter?,
    val jsonBody: Boolean?,
    val metadata: Map<String, String>?,
    val tls: EvTLSConfig?,
    val topic: String?,
    val url: String?
)
