package jp.datable.argo.workflow.client.models

data class EvTLSConfig(
    val caCertSecret: CoreSecretKeySelector? = null,
    val clientCertSecret: CoreSecretKeySelector? = null,
    val clientKeySecret: CoreSecretKeySelector? = null,
    val insecureSkipVerify: Boolean? = null
)
