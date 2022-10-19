package jp.datable.argo.workflow.client.models

data class WfArguments(
    val artifacts: List<WfArtifact>? = null,
    val parameters: List<WfParameter>? = null
)
