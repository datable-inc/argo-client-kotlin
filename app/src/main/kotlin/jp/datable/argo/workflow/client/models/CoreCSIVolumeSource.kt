package jp.datable.argo.workflow.client.models

data class CoreCSIVolumeSource(
    val driver: String,
    val fsType: String?,
    val nodePublishSecretRef: CoreLocalObjectReference?,
    val readOnly: Boolean?,
    val volumeAttributes: Map<String, String>?
)
