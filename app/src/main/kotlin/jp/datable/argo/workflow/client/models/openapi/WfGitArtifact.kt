package jp.datable.argo.workflow.client.models.openapi

data class WfGitArtifact(
    val repo: String,
    val branch: String? = null,
    val depth: Int? = null,
    val disableSubmodules: Boolean? = null,
    val fetch: List<String>? = null,
    val insecureIgnoreHostKey: Boolean? = null,
    val passwordSecret: CoreSecretKeySelector? = null,
    val revision: String? = null,
    val singleBranch: Boolean? = null,
    val sshPrivateKeySecret: CoreSecretKeySelector? = null,
    val usernameSecret: CoreSecretKeySelector? = null
)
