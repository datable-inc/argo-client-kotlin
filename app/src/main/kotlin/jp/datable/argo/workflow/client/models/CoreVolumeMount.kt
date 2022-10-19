package jp.datable.argo.workflow.client.models

data class CoreVolumeMount(
    val mountPath: String,
    val name: String,
    val mountPropagation: String? = null,
    val readOnly: Boolean? = null,
    val subPath: String? = null,
    val subPathExpr: String? = null
)
