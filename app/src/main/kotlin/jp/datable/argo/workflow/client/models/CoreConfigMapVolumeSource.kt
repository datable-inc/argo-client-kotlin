package jp.datable.argo.workflow.client.models

data class CoreConfigMapVolumeSource(
    val defaultMode: Int?,
    val items: List<CoreKeyToPath>?,
    val name: String?,
    val optional: Boolean?
)
