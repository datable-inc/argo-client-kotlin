package jp.datable.argo.workflow.client.models

data class EvGitArtifact(
    val branch: String? = null,
    val cloneDirectory: String? = null,
    val creds: EvGitCreds? = null,
    val filePath: String? = null,
    val insecureIgnoreHostKey: Boolean? = null,
    val ref: String? = null,
    val remote: EvGitRemoteConfig? = null,
    val sshKeySecret: CoreSecretKeySelector? = null,
    val tag: String? = null,
    val url: String? = null
)
