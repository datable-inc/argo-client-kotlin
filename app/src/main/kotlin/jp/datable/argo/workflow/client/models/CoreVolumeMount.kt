package jp.datable.argo.workflow.client.models

data class CoreVolumeMount(
    val mountPath: String,
    val name: String,
    val mountPropagation: String?,
    val readOnly: Boolean?,
    val subPath: String?,
    val subPathExpr: String?
)
