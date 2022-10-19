package jp.datable.argo.workflow.client.models

data class WfClientCertAuth(
    val clientCertSecret: CoreSecretKeySelector? = null,
    val clientKeySecret: CoreSecretKeySelector? = null
)
