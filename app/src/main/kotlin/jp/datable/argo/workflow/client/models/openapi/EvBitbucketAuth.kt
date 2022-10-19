package jp.datable.argo.workflow.client.models.openapi

data class EvBitbucketAuth(
    val basic: EvBitbucketBasicAuth? = null,
    val oauthToken: CoreSecretKeySelector? = null
)
