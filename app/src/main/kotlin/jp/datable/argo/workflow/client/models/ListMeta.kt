package jp.datable.argo.workflow.client.models

data class ListMeta(
    val `continue`: String,
    val remainingItemCount: Int,
    val resourceVersion: String,
    val selfLink: String
)
