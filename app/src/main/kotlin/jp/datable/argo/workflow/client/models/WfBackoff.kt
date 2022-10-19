package jp.datable.argo.workflow.client.models

data class WfBackoff(
    val duration: String? = null,
    val factor: String? = null,
    val maxDuration: String? = null
)
