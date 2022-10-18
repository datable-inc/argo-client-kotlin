package jp.datable.argo.workflow.client.models

data class CoreSecretProjection(
    val items: List<CoreKeyToPath>?,
    val name: String?,
    val optional: Boolean?
)
