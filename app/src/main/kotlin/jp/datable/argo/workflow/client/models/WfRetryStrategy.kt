package jp.datable.argo.workflow.client.models

data class WfRetryStrategy(
    val affinity: WfRetryAffinity?,
    val backoff: WfBackoff?,
    val expression: String?,
    val limit: String?,
    val retryPolicy: String?
)
