package jp.datable.argo.workflow.client.models

data class WfOSSArtifactRepository(
    val accessKeySecret: CoreSecretKeySelector? = null,
    val bucket: String? = null,
    val createBucketIfNotPresent: Boolean? = null,
    val endpoint: String? = null,
    val keyFormat: String? = null,
    val lifecycleRule: WfOSSLifecycleRule? = null,
    val secretKeySecret: CoreSecretKeySelector? = null,
    val securityToken: String? = null
)
