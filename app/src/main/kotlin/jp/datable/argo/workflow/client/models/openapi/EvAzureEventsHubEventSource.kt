package jp.datable.argo.workflow.client.models.openapi

data class EvAzureEventsHubEventSource(
    val filter: EvEventSourceFilter? = null,
    val fqdn: String? = null,
    val hubName: String? = null,
    val metadata: Map<String, String>? = null,
    val sharedAccessKey: CoreSecretKeySelector? = null,
    val sharedAccessKeyName: CoreSecretKeySelector? = null
)
