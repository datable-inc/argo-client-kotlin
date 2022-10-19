package jp.datable.argo.workflow.client.models.openapi

data class EvCondition(
    val lastTransitionTime: String? = null,
    val message: String? = null,
    val reason: String? = null,
    val status: String? = null,
    val type: String? = null
)
