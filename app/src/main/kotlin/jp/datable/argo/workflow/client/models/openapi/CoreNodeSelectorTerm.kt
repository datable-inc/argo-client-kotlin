package jp.datable.argo.workflow.client.models.openapi

data class CoreNodeSelectorTerm(
    val matchExpressions: List<CoreNodeSelectorRequirement>? = null,
    val matchFields: List<CoreNodeSelectorRequirement>? = null
)
