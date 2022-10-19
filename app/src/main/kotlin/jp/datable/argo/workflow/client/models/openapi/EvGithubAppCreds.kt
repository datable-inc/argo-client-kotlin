package jp.datable.argo.workflow.client.models.openapi

data class EvGithubAppCreds(
    val appID: String? = null,
    val installationID: String? = null,
    val privateKey: CoreSecretKeySelector? = null
)
