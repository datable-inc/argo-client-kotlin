package jp.datable.argo.workflow.client.models

data class EvPulsarEventSource(
    val authTokenSecret: CoreSecretKeySelector? = null,
    val connectionBackoff: EvBackoff? = null,
    val filter: EvEventSourceFilter? = null,
    val jsonBody: Boolean? = null,
    val metadata: Map<String, String>? = null,
    val tls: EvTLSConfig? = null,
    val tlsAllowInsecureConnection: Boolean? = null,
    val tlsTrustCertsSecret: CoreSecretKeySelector? = null,
    val tlsValidateHostname: Boolean? = null,
    val topics: List<String>? = null,
    val type: String? = null,
    val url: String? = null
)
