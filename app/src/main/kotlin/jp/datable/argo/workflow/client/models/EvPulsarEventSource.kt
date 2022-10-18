package jp.datable.argo.workflow.client.models

data class EvPulsarEventSource(
    val authTokenSecret: CoreSecretKeySelector?,
    val connectionBackoff: EvBackoff?,
    val filter: EvEventSourceFilter?,
    val jsonBody: Boolean?,
    val metadata: Map<String, String>?,
    val tls: EvTLSConfig?,
    val tlsAllowInsecureConnection: Boolean?,
    val tlsTrustCertsSecret: CoreSecretKeySelector?,
    val tlsValidateHostname: Boolean?,
    val topics: List<String>?,
    val type: String?,
    val url: String?
)
