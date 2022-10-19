package jp.datable.argo.workflow.client.models

data class CoreConfigMapVolumeSource(
    val defaultMode: Int? = null,
    val items: List<CoreKeyToPath>? = null,
    val name: String? = null,
    val optional: Boolean? = null
)
