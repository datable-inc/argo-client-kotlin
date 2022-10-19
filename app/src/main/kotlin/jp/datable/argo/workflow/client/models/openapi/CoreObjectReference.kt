package jp.datable.argo.workflow.client.models.openapi

data class CoreObjectReference(
    val apiVersion: String? = null,
    val fieldPath: String? = null,
    val kind: String? = null,
    val name: String? = null,
    val namespace: String? = null,
    val resourceVersion: String? = null,
    val uid: String? = null
)
