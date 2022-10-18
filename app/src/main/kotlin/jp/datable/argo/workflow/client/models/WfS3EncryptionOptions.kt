package jp.datable.argo.workflow.client.models

data class WfS3EncryptionOptions(
    val enableEncryption: Boolean?,
    val kmsEncryptionContext: String?,
    val kmsKeyId: String?,
    val serverSideCustomerKeySecret: CoreSecretKeySelector?
)
