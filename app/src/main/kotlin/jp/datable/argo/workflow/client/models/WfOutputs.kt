package jp.datable.argo.workflow.client.models

data class WfOutputs(
    val artifacts: List<WfArtifact>?,
    val exitCode: String?,
    val parameters: List<WfParameter>?,
    val result: String?
)
