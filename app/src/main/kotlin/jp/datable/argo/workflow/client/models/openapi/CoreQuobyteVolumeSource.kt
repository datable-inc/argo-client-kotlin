package jp.datable.argo.workflow.client.models.openapi

data class CoreQuobyteVolumeSource(
    val registry: String,
    val volume: String,
    val group: String? = null,
    val readOnly: Boolean? = null,
    val tenant: String? = null,
    val user: String? = null
)
