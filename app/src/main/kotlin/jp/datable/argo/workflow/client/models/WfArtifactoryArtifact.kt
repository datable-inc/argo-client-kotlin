package jp.datable.argo.workflow.client.models

data class WfArtifactoryArtifact(
    val url: String,
    val passwordSecret: CoreSecretKeySelector?,
    val usernameSecret: CoreSecretKeySelector?
)
