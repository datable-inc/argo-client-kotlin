package jp.datable.argo.workflow.client.models.openapi

data class WfArtifactGCStatus(
    val artifactResultsByNode: Map<String, WfArtifactResultNodeStatus>? = null
)
