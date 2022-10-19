package jp.datable.argo.workflow.client.models

data class EvAzureEventHubsTrigger(
    val fqdn: String? = null,
    val hubName: String? = null,
    val parameters: List<EvTriggerParameter>? = null,
    val payload: List<EvTriggerParameter>? = null,
    val sharedAccessKey: CoreSecretKeySelector? = null,
    val sharedAccessKeyName: CoreSecretKeySelector? = null
)
