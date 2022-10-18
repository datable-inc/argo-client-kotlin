package jp.datable.argo.workflow.client.models

data class EvTLSConfig(
    val caCertSecret: CoreSecretKeySelector?,
    val clientCertSecret: CoreSecretKeySelector?,
    val clientKeySecret: CoreSecretKeySelector?,
    val insecureSkipVerify: Boolean?
)
