package jp.datable.argo.workflow.client.models

data class CoreAzureDiskVolumeSource(
    val diskName: String,
    val diskURI: String,
    val cachingMode: String?,
    val fsType: String?,
    val kind: String?,
    val readOnly: Boolean?
)
