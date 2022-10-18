package jp.datable.argo.workflow.client.models

data class CoreObjectReference(
    val apiVersion: String?,
    val fieldPath: String?,
    val kind: String?,
    val name: String?,
    val namespace: String?,
    val resourceVersion: String?,
    val uid: String?
)
