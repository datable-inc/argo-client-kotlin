package jp.datable.argo.workflow.client.models.openapi

data class CoreAzureDiskVolumeSource(
    val diskName: String,
    val diskURI: String,
    val cachingMode: String? = null,
    val fsType: String? = null,
    val kind: String? = null,
    val readOnly: Boolean? = null
)
