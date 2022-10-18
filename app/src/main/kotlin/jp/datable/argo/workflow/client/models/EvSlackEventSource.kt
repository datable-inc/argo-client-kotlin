package jp.datable.argo.workflow.client.models

data class EvSlackEventSource(
    val filter: EvEventSourceFilter?,
    val metadata: Map<String, String>?,
    val signingSecret: CoreSecretKeySelector?,
    val token: CoreSecretKeySelector?,
    val webhook: EvWebhookContext?
)
