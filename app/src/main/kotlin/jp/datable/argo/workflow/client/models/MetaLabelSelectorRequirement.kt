package jp.datable.argo.workflow.client.models

data class MetaLabelSelectorRequirement(
    val key: String,
    val `operator`: String,
    val propertyValues: List<String>?
)
