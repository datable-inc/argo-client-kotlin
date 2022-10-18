package jp.datable.argo.workflow.client.models

data class EvGenericEventSource(
    val authSecret: CoreSecretKeySelector?,
    val config: String?,
    val filter: EvEventSourceFilter?,
    val insecure: Boolean?,
    val jsonBody: Boolean?,
    val metadata: Map<String, String>?,
    val url: String?
)
