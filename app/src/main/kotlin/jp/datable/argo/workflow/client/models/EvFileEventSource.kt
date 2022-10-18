package jp.datable.argo.workflow.client.models

data class EvFileEventSource(
    val eventType: String?,
    val filter: EvEventSourceFilter?,
    val metadata: Map<String, String>?,
    val polling: Boolean?,
    val watchPathConfig: EvWatchPathConfig?
)
