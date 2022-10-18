package jp.datable.argo.workflow.client.models

data class WfArtifactNodeSpec(
    val archiveLocation: WfArtifactLocation?,
    val artifacts: Map<String, WfArtifact>?
)
