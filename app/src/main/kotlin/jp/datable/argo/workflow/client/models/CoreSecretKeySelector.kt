package jp.datable.argo.workflow.client.models

data class CoreSecretKeySelector(
    val key: String,
    val name: String? = null,
    val optional: Boolean? = null
)
