package jp.datable.argo.workflow.client.models.openapi

data class CoreAzureFileVolumeSource(
    val secretName: String,
    val shareName: String,
    val readOnly: Boolean? = null
)
