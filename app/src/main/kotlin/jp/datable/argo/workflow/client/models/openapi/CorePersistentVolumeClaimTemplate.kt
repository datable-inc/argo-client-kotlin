package jp.datable.argo.workflow.client.models.openapi

data class CorePersistentVolumeClaimTemplate(
    val spec: CorePersistentVolumeClaimSpec,
    val metadata: MetaObjectMeta? = null
)
