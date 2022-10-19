package jp.datable.argo.workflow.client.models.openapi

data class CoreISCSIVolumeSource(
    val iqn: String,
    val lun: Int,
    val targetPortal: String,
    val chapAuthDiscovery: Boolean? = null,
    val chapAuthSession: Boolean? = null,
    val fsType: String? = null,
    val initiatorName: String? = null,
    val iscsiInterface: String? = null,
    val portals: List<String>? = null,
    val readOnly: Boolean? = null,
    val secretRef: CoreLocalObjectReference? = null
)
