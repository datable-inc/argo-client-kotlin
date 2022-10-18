package jp.datable.argo.workflow.client.models

data class CoreStorageOSVolumeSource(
    val fsType: String?,
    val readOnly: Boolean?,
    val secretRef: CoreLocalObjectReference?,
    val volumeName: String?,
    val volumeNamespace: String?
)
