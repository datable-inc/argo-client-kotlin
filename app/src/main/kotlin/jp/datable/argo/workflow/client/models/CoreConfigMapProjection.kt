package jp.datable.argo.workflow.client.models

data class CoreConfigMapProjection(
    val items: List<CoreKeyToPath>? = null,
    val name: String? = null,
    val optional: Boolean? = null
)
