package jp.datable.argo.workflow.client.models.openapi

data class CorePersistentVolumeClaimVolumeSource(
    val claimName: String,
    val readOnly: Boolean? = null
)
