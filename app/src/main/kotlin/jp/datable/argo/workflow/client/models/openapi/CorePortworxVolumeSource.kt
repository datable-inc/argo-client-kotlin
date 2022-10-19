package jp.datable.argo.workflow.client.models.openapi

data class CorePortworxVolumeSource(
    val volumeID: String,
    val fsType: String? = null,
    val readOnly: Boolean? = null
)
