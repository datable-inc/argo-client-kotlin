package jp.datable.argo.workflow.client.models

data class EvSNSEventSource(
    val accessKey: CoreSecretKeySelector? = null,
    val endpoint: String? = null,
    val filter: EvEventSourceFilter? = null,
    val metadata: Map<String, String>? = null,
    val region: String? = null,
    val roleARN: String? = null,
    val secretKey: CoreSecretKeySelector? = null,
    val topicArn: String? = null,
    val validateSignature: Boolean? = null,
    val webhook: EvWebhookContext? = null
)
