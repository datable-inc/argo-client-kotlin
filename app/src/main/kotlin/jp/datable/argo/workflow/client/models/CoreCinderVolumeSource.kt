package jp.datable.argo.workflow.client.models

data class CoreCinderVolumeSource(
    val volumeID: String,
    val fsType: String?,
    val readOnly: Boolean?,
    val secretRef: CoreLocalObjectReference?
)
