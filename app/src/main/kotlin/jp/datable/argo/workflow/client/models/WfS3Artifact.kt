package jp.datable.argo.workflow.client.models

data class WfS3Artifact(
    val accessKeySecret: CoreSecretKeySelector?,
    val bucket: String?,
    val createBucketIfNotPresent: WfCreateS3BucketOptions?,
    val encryptionOptions: WfS3EncryptionOptions?,
    val endpoint: String?,
    val insecure: Boolean?,
    val key: String?,
    val region: String?,
    val roleARN: String?,
    val secretKeySecret: CoreSecretKeySelector?,
    val useSDKCreds: Boolean?
)
