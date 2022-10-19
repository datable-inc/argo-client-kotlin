package jp.datable.argo.workflow.client.models

data class CoreNodeSelectorTerm(
    val matchExpressions: List<CoreNodeSelectorRequirement>? = null,
    val matchFields: List<CoreNodeSelectorRequirement>? = null
)
