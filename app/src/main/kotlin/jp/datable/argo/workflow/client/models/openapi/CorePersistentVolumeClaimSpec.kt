package jp.datable.argo.workflow.client.models.openapi

data class CorePersistentVolumeClaimSpec(
    val accessModes: List<String>? = null,
    val dataSource: CoreTypedLocalObjectReference? = null,
    val dataSourceRef: CoreTypedLocalObjectReference? = null,
    val resources: CoreResourceRequirements? = null,
    val selector: MetaLabelSelector? = null,
    val storageClassName: String? = null,
    val volumeMode: String? = null,
    val volumeName: String? = null
)
