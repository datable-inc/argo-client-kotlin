package jp.datable.argo.workflow.client.models.openapi

data class EvSASLConfig(
    val mechanism: String? = null,
    val password: CoreSecretKeySelector? = null,
    val user: CoreSecretKeySelector? = null
)
