package jp.datable.argo.workflow.client.models

data class WfOSSArtifactRepository(
    val accessKeySecret: CoreSecretKeySelector?,
    val bucket: String?,
    val createBucketIfNotPresent: Boolean?,
    val endpoint: String?,
    val keyFormat: String?,
    val lifecycleRule: WfOSSLifecycleRule?,
    val secretKeySecret: CoreSecretKeySelector?,
    val securityToken: String?
)
