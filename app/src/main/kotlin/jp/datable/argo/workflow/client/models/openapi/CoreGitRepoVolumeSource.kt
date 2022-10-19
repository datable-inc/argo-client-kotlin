package jp.datable.argo.workflow.client.models.openapi

data class CoreGitRepoVolumeSource(
    val repository: String,
    val directory: String? = null,
    val revision: String? = null
)
