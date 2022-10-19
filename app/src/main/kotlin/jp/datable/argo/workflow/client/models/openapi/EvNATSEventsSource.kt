package jp.datable.argo.workflow.client.models.openapi

data class EvNATSEventsSource(
    val auth: EvNATSAuth? = null,
    val connectionBackoff: EvBackoff? = null,
    val filter: EvEventSourceFilter? = null,
    val jsonBody: Boolean? = null,
    val metadata: Map<String, String>? = null,
    val subject: String? = null,
    val tls: EvTLSConfig? = null,
    val url: String? = null
)
