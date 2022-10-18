package jp.datable.argo.workflow.client.models

data class EvPulsarTrigger(
    val authTokenSecret: CoreSecretKeySelector?,
    val connectionBackoff: EvBackoff?,
    val parameters: List<EvTriggerParameter>?,
    val payload: List<EvTriggerParameter>?,
    val tls: EvTLSConfig?,
    val tlsAllowInsecureConnection: Boolean?,
    val tlsTrustCertsSecret: CoreSecretKeySelector?,
    val tlsValidateHostname: Boolean?,
    val topic: String?,
    val url: String?
)
