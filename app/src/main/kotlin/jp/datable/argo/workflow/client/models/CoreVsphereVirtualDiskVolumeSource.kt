package jp.datable.argo.workflow.client.models

data class CoreVsphereVirtualDiskVolumeSource(
    val volumePath: String,
    val fsType: String?,
    val storagePolicyID: String?,
    val storagePolicyName: String?
)
