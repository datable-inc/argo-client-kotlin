package jp.datable.argo.workflow.client.models

data class EvGithubAppCreds(
    val appID: String?,
    val installationID: String?,
    val privateKey: CoreSecretKeySelector?
)
