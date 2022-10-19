package jp.datable.argo.workflow.client.models.openapi

data class WfArtifactNodeSpec(
    val archiveLocation: WfArtifactLocation? = null,
    val artifacts: Map<String, WfArtifact>? = null
)
