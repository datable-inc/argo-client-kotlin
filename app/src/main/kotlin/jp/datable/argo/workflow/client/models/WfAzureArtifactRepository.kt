package jp.datable.argo.workflow.client.models

data class WfAzureArtifactRepository(
    val container: String,
    val endpoint: String,
    val accountKeySecret: CoreSecretKeySelector?,
    val blobNameFormat: String?,
    val useSDKCreds: Boolean?
)
