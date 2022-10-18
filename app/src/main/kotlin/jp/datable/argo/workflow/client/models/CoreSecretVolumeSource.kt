package jp.datable.argo.workflow.client.models

data class CoreSecretVolumeSource(
    val defaultMode: Int?,
    val items: List<CoreKeyToPath>?,
    val optional: Boolean?,
    val secretName: String?
)
