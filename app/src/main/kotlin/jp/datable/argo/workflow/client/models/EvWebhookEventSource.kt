package jp.datable.argo.workflow.client.models

data class EvWebhookEventSource(
    val filter: EvEventSourceFilter?,
    val webhookContext: EvWebhookContext?
)
