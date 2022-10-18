package jp.datable.argo.workflow.client.models

data class WfArtifactoryArtifactRepository(
    val passwordSecret: CoreSecretKeySelector?,
    val repoURL: String?,
    val usernameSecret: CoreSecretKeySelector?
)
