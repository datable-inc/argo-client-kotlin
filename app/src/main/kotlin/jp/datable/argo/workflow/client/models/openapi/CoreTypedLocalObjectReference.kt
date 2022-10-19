package jp.datable.argo.workflow.client.models.openapi

data class CoreTypedLocalObjectReference(
    val kind: String,
    val name: String,
    val apiGroup: String? = null
)
