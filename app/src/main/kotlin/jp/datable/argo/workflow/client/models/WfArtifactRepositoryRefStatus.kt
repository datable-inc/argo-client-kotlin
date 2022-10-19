package jp.datable.argo.workflow.client.models

data class WfArtifactRepositoryRefStatus(
    val artifactRepository: WfArtifactRepository? = null,
    val configMap: String? = null,
    val default: Boolean? = null,
    val key: String? = null,
    val namespace: String? = null
)
