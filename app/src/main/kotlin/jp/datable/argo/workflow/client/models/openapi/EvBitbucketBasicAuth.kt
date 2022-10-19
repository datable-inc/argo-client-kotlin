package jp.datable.argo.workflow.client.models.openapi

data class EvBitbucketBasicAuth(
    val password: CoreSecretKeySelector? = null,
    val username: CoreSecretKeySelector? = null
)
