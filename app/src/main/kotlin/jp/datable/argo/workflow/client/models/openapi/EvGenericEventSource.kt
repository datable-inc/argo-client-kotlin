package jp.datable.argo.workflow.client.models.openapi

data class EvGenericEventSource(
    val authSecret: CoreSecretKeySelector? = null,
    val config: String? = null,
    val filter: EvEventSourceFilter? = null,
    val insecure: Boolean? = null,
    val jsonBody: Boolean? = null,
    val metadata: Map<String, String>? = null,
    val url: String? = null
)
