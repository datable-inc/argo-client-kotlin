package jp.datable.argo.workflow.client.models

data class CoreResourceFieldSelector(
    val resource: String,
    val containerName: String? = null,
    val divisor: String? = null
)
