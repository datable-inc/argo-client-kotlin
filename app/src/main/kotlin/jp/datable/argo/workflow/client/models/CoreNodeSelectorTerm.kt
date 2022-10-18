package jp.datable.argo.workflow.client.models

data class CoreNodeSelectorTerm(
    val matchExpressions: List<CoreNodeSelectorRequirement>?,
    val matchFields: List<CoreNodeSelectorRequirement>?
)
