package jp.datable.argo.workflow.client.models.openapi

data class CoreVsphereVirtualDiskVolumeSource(
    val volumePath: String,
    val fsType: String? = null,
    val storagePolicyID: String? = null,
    val storagePolicyName: String? = null
)
