package jp.datable.argo.workflow.client.models

data class WfAzureArtifact(
    val blob: String,
    val container: String,
    val endpoint: String,
    val accountKeySecret: CoreSecretKeySelector?,
    val useSDKCreds: Boolean?
)
