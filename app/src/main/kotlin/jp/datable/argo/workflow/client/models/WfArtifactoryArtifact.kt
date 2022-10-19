package jp.datable.argo.workflow.client.models

data class WfArtifactoryArtifact(
    val url: String,
    val passwordSecret: CoreSecretKeySelector? = null,
    val usernameSecret: CoreSecretKeySelector? = null
)
