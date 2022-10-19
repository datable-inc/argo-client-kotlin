package jp.datable.argo.workflow.client.models

data class EvBasicAuth(
    val password: CoreSecretKeySelector? = null,
    val username: CoreSecretKeySelector? = null
)
