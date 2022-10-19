package jp.datable.argo.workflow.client.models

data class CoreGitRepoVolumeSource(
    val repository: String,
    val directory: String? = null,
    val revision: String? = null
)
