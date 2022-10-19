package jp.datable.argo.workflow.client.models

data class CoreCSIVolumeSource(
    val driver: String,
    val fsType: String? = null,
    val nodePublishSecretRef: CoreLocalObjectReference? = null,
    val readOnly: Boolean? = null,
    val volumeAttributes: Map<String, String>? = null
)
