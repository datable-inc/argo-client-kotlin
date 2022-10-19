package jp.datable.argo.workflow.client.models

data class MetaCreateOptions(
    val dryRun: List<String>? = null,
    val fieldManager: String? = null,
    val fieldValidation: String? = null
)
