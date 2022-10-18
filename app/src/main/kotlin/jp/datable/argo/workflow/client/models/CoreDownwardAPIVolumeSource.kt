package jp.datable.argo.workflow.client.models

data class CoreDownwardAPIVolumeSource(
    val defaultMode: Int?,
    val items: List<CoreDownwardAPIVolumeFile>?
)
