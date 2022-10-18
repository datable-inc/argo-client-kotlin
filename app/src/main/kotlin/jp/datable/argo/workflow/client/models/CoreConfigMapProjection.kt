package jp.datable.argo.workflow.client.models

data class CoreConfigMapProjection(
    val items: List<CoreKeyToPath>?,
    val name: String?,
    val optional: Boolean?
)
