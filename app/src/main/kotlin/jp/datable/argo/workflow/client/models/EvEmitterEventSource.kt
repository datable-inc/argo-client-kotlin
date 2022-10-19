package jp.datable.argo.workflow.client.models

data class EvEmitterEventSource(
    val broker: String? = null,
    val channelKey: String? = null,
    val channelName: String? = null,
    val connectionBackoff: EvBackoff? = null,
    val filter: EvEventSourceFilter? = null,
    val jsonBody: Boolean? = null,
    val metadata: Map<String, String>? = null,
    val password: CoreSecretKeySelector? = null,
    val tls: EvTLSConfig? = null,
    val username: CoreSecretKeySelector? = null
)
