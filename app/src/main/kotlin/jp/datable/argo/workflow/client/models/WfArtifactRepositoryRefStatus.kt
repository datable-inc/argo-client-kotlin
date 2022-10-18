package jp.datable.argo.workflow.client.models

data class WfArtifactRepositoryRefStatus(
    val artifactRepository: WfArtifactRepository?,
    val configMap: String?,
    val default: Boolean?,
    val key: String?,
    val namespace: String?
)
