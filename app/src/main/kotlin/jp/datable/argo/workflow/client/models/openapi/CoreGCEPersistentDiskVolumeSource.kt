package jp.datable.argo.workflow.client.models.openapi

data class CoreGCEPersistentDiskVolumeSource(
    val pdName: String,
    val fsType: String? = null,
    val partition: Int? = null,
    val readOnly: Boolean? = null
)
