package jp.datable.argo.workflow.client.models

data class WfContainerSetTemplate(
    val containers: List<WfContainerNode>,
    val retryStrategy: WfContainerSetRetryStrategy? = null,
    val volumeMounts: List<CoreVolumeMount>? = null
)
