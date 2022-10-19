package jp.datable.argo.workflow.client.models

data class EvStripeEventSource(
    val apiKey: CoreSecretKeySelector? = null,
    val createWebhook: Boolean? = null,
    val eventFilter: List<String>? = null,
    val metadata: Map<String, String>? = null,
    val webhook: EvWebhookContext? = null
)
