package jp.datable.argo.workflow.client.models

data class EvSNSEventSource(
    val accessKey: CoreSecretKeySelector?,
    val endpoint: String?,
    val filter: EvEventSourceFilter?,
    val metadata: Map<String, String>?,
    val region: String?,
    val roleARN: String?,
    val secretKey: CoreSecretKeySelector?,
    val topicArn: String?,
    val validateSignature: Boolean?,
    val webhook: EvWebhookContext?
)
