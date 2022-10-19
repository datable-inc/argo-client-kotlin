package jp.datable.argo.workflow.client.models

data class WfS3EncryptionOptions(
    val enableEncryption: Boolean? = null,
    val kmsEncryptionContext: String? = null,
    val kmsKeyId: String? = null,
    val serverSideCustomerKeySecret: CoreSecretKeySelector? = null
)
