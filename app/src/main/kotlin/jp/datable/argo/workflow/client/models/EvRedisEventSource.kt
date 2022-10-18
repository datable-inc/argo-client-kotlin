package jp.datable.argo.workflow.client.models

data class EvRedisEventSource(
    val channels: List<String>?,
    val db: Int?,
    val filter: EvEventSourceFilter?,
    val hostAddress: String?,
    val jsonBody: Boolean?,
    val metadata: Map<String, String>?,
    val namespace: String?,
    val password: CoreSecretKeySelector?,
    val tls: EvTLSConfig?,
    val username: String?
)
