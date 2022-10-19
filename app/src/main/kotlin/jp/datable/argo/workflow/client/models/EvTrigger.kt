package jp.datable.argo.workflow.client.models

data class EvTrigger(
    val parameters: List<EvTriggerParameter>? = null,
    val policy: EvTriggerPolicy? = null,
    val rateLimit: EvRateLimit? = null,
    val retryStrategy: EvBackoff? = null,
    val template: EvTriggerTemplate? = null
)
