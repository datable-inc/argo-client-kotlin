package jp.datable.argo.workflow.client.models

data class CoreSecretVolumeSource(
    val defaultMode: Int? = null,
    val items: List<CoreKeyToPath>? = null,
    val optional: Boolean? = null,
    val secretName: String? = null
)
