package jp.datable.argo.workflow.client.models.openapi

data class WfInputs(
    val artifacts: List<WfArtifact>? = null,
    val parameters: List<WfParameter>? = null
)
