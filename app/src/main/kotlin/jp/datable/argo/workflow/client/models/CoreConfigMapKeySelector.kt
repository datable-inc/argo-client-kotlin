package jp.datable.argo.workflow.client.models

data class CoreConfigMapKeySelector(
    val key: String,
    val name: String? = null,
    val optional: Boolean? = null
)
