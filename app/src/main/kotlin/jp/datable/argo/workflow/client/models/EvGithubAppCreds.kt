package jp.datable.argo.workflow.client.models

data class EvGithubAppCreds(
    val appID: String? = null,
    val installationID: String? = null,
    val privateKey: CoreSecretKeySelector? = null
)
