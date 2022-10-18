package jp.datable.argo.workflow.client.models

data class WfBasicAuth(
    val passwordSecret: CoreSecretKeySelector?,
    val usernameSecret: CoreSecretKeySelector?
)
