package jp.datable.argo.workflow.client.models

data class WfArtifactGCStatus(val artifactResultsByNode: Map<String, WfArtifactResultNodeStatus>?)
