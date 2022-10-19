package jp.datable.argo.workflow.client.models

data class EvSQSEventSource(
    val accessKey: CoreSecretKeySelector? = null,
    val dlq: Boolean? = null,
    val endpoint: String? = null,
    val filter: EvEventSourceFilter? = null,
    val jsonBody: Boolean? = null,
    val metadata: Map<String, String>? = null,
    val queue: String? = null,
    val queueAccountId: String? = null,
    val region: String? = null,
    val roleARN: String? = null,
    val secretKey: CoreSecretKeySelector? = null,
    val sessionToken: CoreSecretKeySelector? = null,
    val waitTimeSeconds: String? = null
)
