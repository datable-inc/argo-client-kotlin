package jp.datable.argo.workflow.client.models.openapi

data class CoreEphemeralVolumeSource(
    val volumeClaimTemplate: CorePersistentVolumeClaimTemplate? = null
)
