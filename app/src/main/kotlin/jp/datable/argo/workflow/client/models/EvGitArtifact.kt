package jp.datable.argo.workflow.client.models

data class EvGitArtifact(
    val branch: String?,
    val cloneDirectory: String?,
    val creds: EvGitCreds?,
    val filePath: String?,
    val insecureIgnoreHostKey: Boolean?,
    val ref: String?,
    val remote: EvGitRemoteConfig?,
    val sshKeySecret: CoreSecretKeySelector?,
    val tag: String?,
    val url: String?
)
