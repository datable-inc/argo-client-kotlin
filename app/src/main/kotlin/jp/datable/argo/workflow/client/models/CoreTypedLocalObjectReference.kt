package jp.datable.argo.workflow.client.models

data class CoreTypedLocalObjectReference(
    val kind: String,
    val name: String,
    val apiGroup: String? = null
)
