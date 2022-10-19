package jp.datable.argo.workflow.client.models

data class CoreCinderVolumeSource(
    val volumeID: String,
    val fsType: String? = null,
    val readOnly: Boolean? = null,
    val secretRef: CoreLocalObjectReference? = null
)
