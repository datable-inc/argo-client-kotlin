package jp.datable.argo.workflow.client.models

data class WfGitArtifact(
    val repo: String,
    val branch: String?,
    val depth: Int?,
    val disableSubmodules: Boolean?,
    val fetch: List<String>?,
    val insecureIgnoreHostKey: Boolean?,
    val passwordSecret: CoreSecretKeySelector?,
    val revision: String?,
    val singleBranch: Boolean?,
    val sshPrivateKeySecret: CoreSecretKeySelector?,
    val usernameSecret: CoreSecretKeySelector?
)
