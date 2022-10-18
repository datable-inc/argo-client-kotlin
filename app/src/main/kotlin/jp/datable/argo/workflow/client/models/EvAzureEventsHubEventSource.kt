package jp.datable.argo.workflow.client.models

data class EvAzureEventsHubEventSource(
    val filter: EvEventSourceFilter?,
    val fqdn: String?,
    val hubName: String?,
    val metadata: Map<String, String>?,
    val sharedAccessKey: CoreSecretKeySelector?,
    val sharedAccessKeyName: CoreSecretKeySelector?
)
