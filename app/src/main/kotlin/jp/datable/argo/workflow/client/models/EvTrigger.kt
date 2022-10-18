package jp.datable.argo.workflow.client.models

data class EvTrigger(
    val parameters: List<EvTriggerParameter>?,
    val policy: EvTriggerPolicy?,
    val rateLimit: EvRateLimit?,
    val retryStrategy: EvBackoff?,
    val template: EvTriggerTemplate?
)
