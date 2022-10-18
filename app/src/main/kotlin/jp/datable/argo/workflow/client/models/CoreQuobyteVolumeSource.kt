package jp.datable.argo.workflow.client.models

data class CoreQuobyteVolumeSource(
    val registry: String,
    val volume: String,
    val group: String?,
    val readOnly: Boolean?,
    val tenant: String?,
    val user: String?
)
