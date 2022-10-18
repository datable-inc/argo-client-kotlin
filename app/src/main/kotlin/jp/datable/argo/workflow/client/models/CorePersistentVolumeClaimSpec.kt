package jp.datable.argo.workflow.client.models

data class CorePersistentVolumeClaimSpec(
    val accessModes: List<String>?,
    val dataSource: CoreTypedLocalObjectReference?,
    val dataSourceRef: CoreTypedLocalObjectReference?,
    val resources: CoreResourceRequirements?,
    val selector: MetaLabelSelector?,
    val storageClassName: String?,
    val volumeMode: String?,
    val volumeName: String?
)
