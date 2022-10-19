package jp.datable.argo.workflow.client.models.openapi

data class WfBasicAuth(
    val passwordSecret: CoreSecretKeySelector? = null,
    val usernameSecret: CoreSecretKeySelector? = null
)
