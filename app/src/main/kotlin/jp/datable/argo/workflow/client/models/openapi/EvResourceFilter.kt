package jp.datable.argo.workflow.client.models.openapi

data class EvResourceFilter(
    val afterStart: Boolean? = null,
    val createdBy: String? = null,
    val fields: List<EvSelector>? = null,
    val labels: List<EvSelector>? = null,
    val prefix: String? = null
)
