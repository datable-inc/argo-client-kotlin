package jp.datable.argo.workflow.client.models.openapi

data class EvGitCreds(
    val password: CoreSecretKeySelector? = null,
    val username: CoreSecretKeySelector? = null
)
