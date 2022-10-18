package jp.datable.argo.workflow.client.models

data class MetaCreateOptions(
    val dryRun: List<String>?,
    val fieldManager: String?,
    val fieldValidation: String?
)
