package jp.datable.argo.workflow.client.models

data class EvSlackEventSource(
    val filter: EvEventSourceFilter? = null,
    val metadata: Map<String, String>? = null,
    val signingSecret: CoreSecretKeySelector? = null,
    val token: CoreSecretKeySelector? = null,
    val webhook: EvWebhookContext? = null
)
