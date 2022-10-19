package jp.datable.argo.workflow.client.models.openapi

data class EvNATSAuth(
    val basic: EvBasicAuth? = null,
    val credential: CoreSecretKeySelector? = null,
    val nkey: CoreSecretKeySelector? = null,
    val token: CoreSecretKeySelector? = null
)
