package jp.datable.argo.workflow.client.models.openapi

data class WfGCSArtifactRepository(
    val bucket: String? = null,
    val keyFormat: String? = null,
    val serviceAccountKeySecret: CoreSecretKeySelector? = null
)
