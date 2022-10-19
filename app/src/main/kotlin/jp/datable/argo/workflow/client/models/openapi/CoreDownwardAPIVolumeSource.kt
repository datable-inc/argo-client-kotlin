package jp.datable.argo.workflow.client.models.openapi

data class CoreDownwardAPIVolumeSource(
    val defaultMode: Int? = null,
    val items: List<CoreDownwardAPIVolumeFile>? = null
)
