package jp.datable.argo.workflow.client.models

data class MetaManagedFieldsEntry(
    val apiVersion: String?,
    val fieldsType: String?,
    val fieldsV1: Any?,
    val manager: String?,
    val operation: String?,
    val subresource: String?,
    val time: String?
)
