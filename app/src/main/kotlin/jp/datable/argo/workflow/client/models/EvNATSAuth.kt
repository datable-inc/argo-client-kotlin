package jp.datable.argo.workflow.client.models

data class EvNATSAuth(
    val basic: EvBasicAuth?,
    val credential: CoreSecretKeySelector?,
    val nkey: CoreSecretKeySelector?,
    val token: CoreSecretKeySelector?
)
