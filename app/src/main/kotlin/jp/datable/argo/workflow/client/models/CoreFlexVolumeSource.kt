package jp.datable.argo.workflow.client.models

data class CoreFlexVolumeSource(
    val driver: String,
    val fsType: String?,
    val options: Map<String, String>?,
    val readOnly: Boolean?,
    val secretRef: CoreLocalObjectReference?
)
