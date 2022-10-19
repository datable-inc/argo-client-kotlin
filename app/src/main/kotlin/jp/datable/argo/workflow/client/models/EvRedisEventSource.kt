package jp.datable.argo.workflow.client.models

data class EvRedisEventSource(
    val channels: List<String>? = null,
    val db: Int? = null,
    val filter: EvEventSourceFilter? = null,
    val hostAddress: String? = null,
    val jsonBody: Boolean? = null,
    val metadata: Map<String, String>? = null,
    val namespace: String? = null,
    val password: CoreSecretKeySelector? = null,
    val tls: EvTLSConfig? = null,
    val username: String? = null
)
