package jp.datable.argo.workflow.client.models

data class WfArtifactNodeSpec(
    val archiveLocation: WfArtifactLocation? = null,
    val artifacts: Map<String, WfArtifact>? = null
)
