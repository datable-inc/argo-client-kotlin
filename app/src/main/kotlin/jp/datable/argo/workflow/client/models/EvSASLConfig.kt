package jp.datable.argo.workflow.client.models

data class EvSASLConfig(
    val mechanism: String?,
    val password: CoreSecretKeySelector?,
    val user: CoreSecretKeySelector?
)
