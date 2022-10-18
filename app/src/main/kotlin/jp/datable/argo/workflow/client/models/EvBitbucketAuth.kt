package jp.datable.argo.workflow.client.models

data class EvBitbucketAuth(
    val basic: EvBitbucketBasicAuth?,
    val oauthToken: CoreSecretKeySelector?
)
