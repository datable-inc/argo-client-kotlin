package jp.datable.argo.workflow.client.models.openapi

data class WfRetryStrategy(
    val affinity: WfRetryAffinity? = null,
    val backoff: WfBackoff? = null,
    val expression: String? = null,
    val limit: String? = null,
    val retryPolicy: String? = null
)
