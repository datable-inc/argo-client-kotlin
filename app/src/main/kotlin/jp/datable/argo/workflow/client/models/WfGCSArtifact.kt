package jp.datable.argo.workflow.client.models

data class WfGCSArtifact(
    val key: String,
    val bucket: String? = null,
    val serviceAccountKeySecret: CoreSecretKeySelector? = null
)
