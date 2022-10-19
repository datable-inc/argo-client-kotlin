package jp.datable.argo.workflow.client.models

data class MetaManagedFieldsEntry(
    val apiVersion: String? = null,
    val fieldsType: String? = null,
    val fieldsV1: Any? = null,
    val manager: String? = null,
    val operation: String? = null,
    val subresource: String? = null,
    val time: String? = null
)
