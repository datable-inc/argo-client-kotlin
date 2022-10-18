package jp.datable.argo.workflow.client.models

data class WfOSSArtifact(
    val key: String,
    val accessKeySecret: CoreSecretKeySelector?,
    val bucket: String?,
    val createBucketIfNotPresent: Boolean?,
    val endpoint: String?,
    val lifecycleRule: WfOSSLifecycleRule?,
    val secretKeySecret: CoreSecretKeySelector?,
    val securityToken: String?
)
