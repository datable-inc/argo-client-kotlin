package jp.datable.argo.workflow.client.models

data class WfGCSArtifactRepository(
    val bucket: String?,
    val keyFormat: String?,
    val serviceAccountKeySecret: CoreSecretKeySelector?
)
