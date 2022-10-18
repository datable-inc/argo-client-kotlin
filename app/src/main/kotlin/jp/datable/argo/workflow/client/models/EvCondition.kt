package jp.datable.argo.workflow.client.models

data class EvCondition(
    val lastTransitionTime: String?,
    val message: String?,
    val reason: String?,
    val status: String?,
    val type: String?
)
