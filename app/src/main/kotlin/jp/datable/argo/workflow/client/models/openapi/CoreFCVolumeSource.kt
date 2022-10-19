package jp.datable.argo.workflow.client.models.openapi

data class CoreFCVolumeSource(
    val fsType: String? = null,
    val lun: Int? = null,
    val readOnly: Boolean? = null,
    val targetWWNs: List<String>? = null,
    val wwids: List<String>? = null
)
