package jp.datable.argo.workflow.client.models

data class WfArtifactGC(
    val podMetadata: WfMetadata?,
    val serviceAccountName: String?,
    val strategy: String?
)
