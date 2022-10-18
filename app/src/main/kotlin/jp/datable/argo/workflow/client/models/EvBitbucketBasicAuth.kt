package jp.datable.argo.workflow.client.models

data class EvBitbucketBasicAuth(
    val password: CoreSecretKeySelector?,
    val username: CoreSecretKeySelector?
)
