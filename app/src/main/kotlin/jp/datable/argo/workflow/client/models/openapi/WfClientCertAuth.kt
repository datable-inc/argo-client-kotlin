package jp.datable.argo.workflow.client.models.openapi

data class WfClientCertAuth(
    val clientCertSecret: CoreSecretKeySelector? = null,
    val clientKeySecret: CoreSecretKeySelector? = null
)
