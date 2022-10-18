package jp.datable.argo.workflow.client.models

data class EvRedisStreamEventSource(
    val consumerGroup: String?,
    val db: Int?,
    val filter: EvEventSourceFilter?,
    val hostAddress: String?,
    val maxMsgCountPerRead: Int?,
    val metadata: Map<String, String>?,
    val password: CoreSecretKeySelector?,
    val streams: List<String>?,
    val tls: EvTLSConfig?,
    val username: String?
)
