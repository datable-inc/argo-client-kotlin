package jp.datable.argo.workflow.client.models.openapi

data class EvBasicAuth(
    val password: CoreSecretKeySelector? = null,
    val username: CoreSecretKeySelector? = null
)
