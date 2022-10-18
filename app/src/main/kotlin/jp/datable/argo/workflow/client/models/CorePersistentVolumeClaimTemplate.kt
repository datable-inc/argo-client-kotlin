package jp.datable.argo.workflow.client.models

data class CorePersistentVolumeClaimTemplate(
    val spec: CorePersistentVolumeClaimSpec,
    val metadata: MetaObjectMeta?
)
