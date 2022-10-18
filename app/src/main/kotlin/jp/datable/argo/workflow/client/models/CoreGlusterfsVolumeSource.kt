package jp.datable.argo.workflow.client.models

data class CoreGlusterfsVolumeSource(
    val endpoints: String,
    val path: String,
    val readOnly: Boolean?
)
