package jp.datable.argo.workflow.client.models

data class EvPulsarTrigger(
    val authTokenSecret: CoreSecretKeySelector? = null,
    val connectionBackoff: EvBackoff? = null,
    val parameters: List<EvTriggerParameter>? = null,
    val payload: List<EvTriggerParameter>? = null,
    val tls: EvTLSConfig? = null,
    val tlsAllowInsecureConnection: Boolean? = null,
    val tlsTrustCertsSecret: CoreSecretKeySelector? = null,
    val tlsValidateHostname: Boolean? = null,
    val topic: String? = null,
    val url: String? = null
)
