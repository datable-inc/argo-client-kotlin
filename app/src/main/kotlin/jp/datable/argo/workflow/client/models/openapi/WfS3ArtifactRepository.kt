package jp.datable.argo.workflow.client.models.openapi

data class WfS3ArtifactRepository(
    val accessKeySecret: CoreSecretKeySelector? = null,
    val bucket: String? = null,
    val createBucketIfNotPresent: WfCreateS3BucketOptions? = null,
    val encryptionOptions: WfS3EncryptionOptions? = null,
    val endpoint: String? = null,
    val insecure: Boolean? = null,
    val keyFormat: String? = null,
    val keyPrefix: String? = null,
    val region: String? = null,
    val roleARN: String? = null,
    val secretKeySecret: CoreSecretKeySelector? = null,
    val useSDKCreds: Boolean? = null
)
