package jp.datable.argo.workflow.client.models

data class EvAzureEventHubsTrigger(
    val fqdn: String?,
    val hubName: String?,
    val parameters: List<EvTriggerParameter>?,
    val payload: List<EvTriggerParameter>?,
    val sharedAccessKey: CoreSecretKeySelector?,
    val sharedAccessKeyName: CoreSecretKeySelector?
)
