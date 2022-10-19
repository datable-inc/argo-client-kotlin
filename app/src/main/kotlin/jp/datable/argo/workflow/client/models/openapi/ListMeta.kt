package jp.datable.argo.workflow.client.models.openapi

data class ListMeta(
    val `continue`: String,
    val remainingItemCount: Int,
    val resourceVersion: String,
    val selfLink: String
)
