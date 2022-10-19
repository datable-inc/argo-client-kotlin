package jp.datable.argo.workflow.client.models

data class CoreDownwardAPIVolumeSource(
    val defaultMode: Int? = null,
    val items: List<CoreDownwardAPIVolumeFile>? = null
)
