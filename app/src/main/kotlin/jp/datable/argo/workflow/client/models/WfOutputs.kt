package jp.datable.argo.workflow.client.models

data class WfOutputs(
    val artifacts: List<WfArtifact>? = null,
    val exitCode: String? = null,
    val parameters: List<WfParameter>? = null,
    val result: String? = null
)
