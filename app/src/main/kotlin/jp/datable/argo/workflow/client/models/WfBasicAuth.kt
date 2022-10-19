package jp.datable.argo.workflow.client.models

data class WfBasicAuth(
    val passwordSecret: CoreSecretKeySelector? = null,
    val usernameSecret: CoreSecretKeySelector? = null
)
