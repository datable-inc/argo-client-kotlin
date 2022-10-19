package jp.datable.argo.workflow.client.models

data class EvBitbucketBasicAuth(
    val password: CoreSecretKeySelector? = null,
    val username: CoreSecretKeySelector? = null
)
