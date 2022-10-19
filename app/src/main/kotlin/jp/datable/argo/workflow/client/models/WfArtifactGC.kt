package jp.datable.argo.workflow.client.models

data class WfArtifactGC(
    val podMetadata: WfMetadata? = null,
    val serviceAccountName: String? = null,
    val strategy: String? = null
)
