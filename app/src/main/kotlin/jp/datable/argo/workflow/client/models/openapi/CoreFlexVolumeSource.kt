package jp.datable.argo.workflow.client.models.openapi

data class CoreFlexVolumeSource(
    val driver: String,
    val fsType: String? = null,
    val options: Map<String, String>? = null,
    val readOnly: Boolean? = null,
    val secretRef: CoreLocalObjectReference? = null
)
