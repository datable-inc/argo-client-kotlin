package jp.datable.argo.workflow.client.models

data class CoreScaleIOVolumeSource(
    val gateway: String,
    val secretRef: CoreLocalObjectReference,
    val system: String,
    val fsType: String?,
    val protectionDomain: String?,
    val readOnly: Boolean?,
    val sslEnabled: Boolean?,
    val storageMode: String?,
    val storagePool: String?,
    val volumeName: String?
)
