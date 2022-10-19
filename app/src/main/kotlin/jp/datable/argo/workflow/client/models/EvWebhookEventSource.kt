package jp.datable.argo.workflow.client.models

data class EvWebhookEventSource(
    val filter: EvEventSourceFilter? = null,
    val webhookContext: EvWebhookContext? = null
)
