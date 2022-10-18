package jp.datable.argo.workflow.client.models

data class EvStripeEventSource(
    val apiKey: CoreSecretKeySelector?,
    val createWebhook: Boolean?,
    val eventFilter: List<String>?,
    val metadata: Map<String, String>?,
    val webhook: EvWebhookContext?
)
