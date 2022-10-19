package jp.datable.argo.workflow.client.models

data class EvGitCreds(
    val password: CoreSecretKeySelector? = null,
    val username: CoreSecretKeySelector? = null
)
