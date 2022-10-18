package jp.datable.argo.workflow.client.models

data class CorePortworxVolumeSource(
    val volumeID: String,
    val fsType: String?,
    val readOnly: Boolean?
)
