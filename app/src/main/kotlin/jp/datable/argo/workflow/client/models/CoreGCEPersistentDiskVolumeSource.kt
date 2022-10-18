package jp.datable.argo.workflow.client.models

data class CoreGCEPersistentDiskVolumeSource(
    val pdName: String,
    val fsType: String?,
    val partition: Int?,
    val readOnly: Boolean?
)
