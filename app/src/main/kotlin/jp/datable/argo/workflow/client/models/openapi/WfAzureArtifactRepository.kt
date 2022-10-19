package jp.datable.argo.workflow.client.models.openapi

data class WfAzureArtifactRepository(
    val container: String,
    val endpoint: String,
    val accountKeySecret: CoreSecretKeySelector? = null,
    val blobNameFormat: String? = null,
    val useSDKCreds: Boolean? = null
)
