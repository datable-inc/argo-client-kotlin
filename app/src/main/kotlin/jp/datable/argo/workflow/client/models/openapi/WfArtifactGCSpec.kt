package jp.datable.argo.workflow.client.models.openapi

data class WfArtifactGCSpec(val artifactsByNode: Map<String, WfArtifactNodeSpec>? = null)
