package jp.datable.argo.workflow.client.models

data class CorePersistentVolumeClaim(
    val apiVersion: String? = null,
    val kind: String? = null,
    val metadata: MetaObjectMeta? = null,
    val spec: CorePersistentVolumeClaimSpec? = null,
    val status: CorePersistentVolumeClaimStatus? = null
)
