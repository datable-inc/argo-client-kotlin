package jp.datable.argo.workflow.client.models.openapi

data class WfBackoff(
    val duration: String? = null,
    val factor: String? = null,
    val maxDuration: String? = null
)
