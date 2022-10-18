package jp.datable.argo.workflow.client.models

data class CoreResourceFieldSelector(
    val resource: String,
    val containerName: String?,
    val divisor: String?
)
