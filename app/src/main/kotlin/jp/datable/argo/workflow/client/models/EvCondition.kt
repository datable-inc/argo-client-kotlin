package jp.datable.argo.workflow.client.models

data class EvCondition(
    val lastTransitionTime: java.time.OffsetDateTime?,
    val message: String?,
    val reason: String?,
    val status: String?,
    val type: String?
)
