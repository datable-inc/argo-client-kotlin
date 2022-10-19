package jp.datable.argo.workflow.client.models

data class MetaLabelSelector(
    val matchExpressions: List<MetaLabelSelectorRequirement>? = null,
    val matchLabels: Map<String, String>? = null
)
