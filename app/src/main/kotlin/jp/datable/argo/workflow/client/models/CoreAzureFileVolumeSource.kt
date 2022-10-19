package jp.datable.argo.workflow.client.models

data class CoreAzureFileVolumeSource(
    val secretName: String,
    val shareName: String,
    val readOnly: Boolean? = null
)
