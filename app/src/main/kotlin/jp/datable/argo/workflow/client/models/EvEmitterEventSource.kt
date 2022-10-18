package jp.datable.argo.workflow.client.models

data class EvEmitterEventSource(
    val broker: String?,
    val channelKey: String?,
    val channelName: String?,
    val connectionBackoff: EvBackoff?,
    val filter: EvEventSourceFilter?,
    val jsonBody: Boolean?,
    val metadata: Map<String, String>?,
    val password: CoreSecretKeySelector?,
    val tls: EvTLSConfig?,
    val username: CoreSecretKeySelector?
)
