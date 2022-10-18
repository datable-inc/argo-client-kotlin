package jp.datable.argo.workflow.client.models

data class EvNATSEventsSource(
    val auth: EvNATSAuth?,
    val connectionBackoff: EvBackoff?,
    val filter: EvEventSourceFilter?,
    val jsonBody: Boolean?,
    val metadata: Map<String, String>?,
    val subject: String?,
    val tls: EvTLSConfig?,
    val url: String?
)
