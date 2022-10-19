package jp.datable.argo.workflow.client.models

data class EvRedisStreamEventSource(
    val consumerGroup: String? = null,
    val db: Int? = null,
    val filter: EvEventSourceFilter? = null,
    val hostAddress: String? = null,
    val maxMsgCountPerRead: Int? = null,
    val metadata: Map<String, String>? = null,
    val password: CoreSecretKeySelector? = null,
    val streams: List<String>? = null,
    val tls: EvTLSConfig? = null,
    val username: String? = null
)
