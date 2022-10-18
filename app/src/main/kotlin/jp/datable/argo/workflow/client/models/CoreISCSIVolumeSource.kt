package jp.datable.argo.workflow.client.models

data class CoreISCSIVolumeSource(
    val iqn: String,
    val lun: Int,
    val targetPortal: String,
    val chapAuthDiscovery: Boolean?,
    val chapAuthSession: Boolean?,
    val fsType: String?,
    val initiatorName: String?,
    val iscsiInterface: String?,
    val portals: List<String>?,
    val readOnly: Boolean?,
    val secretRef: CoreLocalObjectReference?
)
