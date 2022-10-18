package jp.datable.argo.workflow.client.models

data class CorePersistentVolumeClaim(
    val apiVersion: String?,
    val kind: String?,
    val metadata: MetaObjectMeta?,
    val spec: CorePersistentVolumeClaimSpec?,
    val status: CorePersistentVolumeClaimStatus?
)
