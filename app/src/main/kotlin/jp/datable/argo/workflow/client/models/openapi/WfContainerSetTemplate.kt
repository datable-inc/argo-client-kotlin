package jp.datable.argo.workflow.client.models.openapi

data class WfContainerSetTemplate(
    val containers: List<WfContainerNode>,
    val retryStrategy: WfContainerSetRetryStrategy? = null,
    val volumeMounts: List<CoreVolumeMount>? = null
)
