package jp.datable.argo.workflow.client.models

data class EvBitbucketAuth(
    val basic: EvBitbucketBasicAuth? = null,
    val oauthToken: CoreSecretKeySelector? = null
)
