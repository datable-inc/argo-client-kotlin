package jp.datable.argo.workflow.client.models

data class CoreDownwardAPIVolumeFile(
    val path: String,
    val fieldRef: CoreObjectFieldSelector?,
    val mode: Int?,
    val resourceFieldRef: CoreResourceFieldSelector?
)
