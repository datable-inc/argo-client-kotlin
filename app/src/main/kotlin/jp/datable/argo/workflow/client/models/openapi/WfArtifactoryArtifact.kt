package jp.datable.argo.workflow.client.models.openapi

data class WfArtifactoryArtifact(
    val url: String,
    val passwordSecret: CoreSecretKeySelector? = null,
    val usernameSecret: CoreSecretKeySelector? = null
)
