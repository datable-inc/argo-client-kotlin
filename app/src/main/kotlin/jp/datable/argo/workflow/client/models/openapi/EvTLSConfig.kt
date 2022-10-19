package jp.datable.argo.workflow.client.models.openapi

data class EvTLSConfig(
    val caCertSecret: CoreSecretKeySelector? = null,
    val clientCertSecret: CoreSecretKeySelector? = null,
    val clientKeySecret: CoreSecretKeySelector? = null,
    val insecureSkipVerify: Boolean? = null
)
