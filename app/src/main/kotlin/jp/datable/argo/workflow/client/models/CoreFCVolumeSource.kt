package jp.datable.argo.workflow.client.models

data class CoreFCVolumeSource(
    val fsType: String?,
    val lun: Int?,
    val readOnly: Boolean?,
    val targetWWNs: List<String>?,
    val wwids: List<String>?
)
