package jp.datable.argo.workflow.client.models.openapi

data class WfArtifactoryArtifactRepository(
    val passwordSecret: CoreSecretKeySelector? = null,
    val repoURL: String? = null,
    val usernameSecret: CoreSecretKeySelector? = null
)
