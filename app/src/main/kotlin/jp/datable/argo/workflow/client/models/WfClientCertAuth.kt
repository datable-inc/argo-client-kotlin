package jp.datable.argo.workflow.client.models

data class WfClientCertAuth(
    val clientCertSecret: CoreSecretKeySelector?,
    val clientKeySecret: CoreSecretKeySelector?
)
