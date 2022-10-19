package jp.datable.argo.workflow.client.models.openapi

data class CoreStorageOSVolumeSource(
    val fsType: String? = null,
    val readOnly: Boolean? = null,
    val secretRef: CoreLocalObjectReference? = null,
    val volumeName: String? = null,
    val volumeNamespace: String? = null
)
