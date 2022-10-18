package jp.datable.argo.workflow.client.models

data class EvSQSEventSource(
    val accessKey: CoreSecretKeySelector?,
    val dlq: Boolean?,
    val endpoint: String?,
    val filter: EvEventSourceFilter?,
    val jsonBody: Boolean?,
    val metadata: Map<String, String>?,
    val queue: String?,
    val queueAccountId: String?,
    val region: String?,
    val roleARN: String?,
    val secretKey: CoreSecretKeySelector?,
    val sessionToken: CoreSecretKeySelector?,
    val waitTimeSeconds: String?
)
