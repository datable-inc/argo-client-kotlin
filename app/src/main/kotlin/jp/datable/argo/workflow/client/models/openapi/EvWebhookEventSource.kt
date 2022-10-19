package jp.datable.argo.workflow.client.models.openapi

data class EvWebhookEventSource(
    val filter: EvEventSourceFilter? = null,
    val webhookContext: EvWebhookContext? = null
)
