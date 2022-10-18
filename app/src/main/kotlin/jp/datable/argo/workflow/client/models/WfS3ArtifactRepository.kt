package jp.datable.argo.workflow.client.models

data class WfS3ArtifactRepository(
    val accessKeySecret: CoreSecretKeySelector?,
    val bucket: String?,
    val createBucketIfNotPresent: WfCreateS3BucketOptions?,
    val encryptionOptions: WfS3EncryptionOptions?,
    val endpoint: String?,
    val insecure: Boolean?,
    val keyFormat: String?,
    val keyPrefix: String?,
    val region: String?,
    val roleARN: String?,
    val secretKeySecret: CoreSecretKeySelector?,
    val useSDKCreds: Boolean?
)
