package jp.datable.argo.workflow.client.models

data class WfArtifactResult(
    val name: String,
    val error: String? = null,
    val success: Boolean? = null
)
