package jp.datable.argo.workflow.client.models

data class CoreScaleIOVolumeSource(
    val gateway: String,
    val secretRef: CoreLocalObjectReference,
    val system: String,
    val fsType: String? = null,
    val protectionDomain: String? = null,
    val readOnly: Boolean? = null,
    val sslEnabled: Boolean? = null,
    val storageMode: String? = null,
    val storagePool: String? = null,
    val volumeName: String? = null
)
