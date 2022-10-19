package jp.datable.argo.workflow.client.models.openapi

data class EvFileEventSource(
    val eventType: String? = null,
    val filter: EvEventSourceFilter? = null,
    val metadata: Map<String, String>? = null,
    val polling: Boolean? = null,
    val watchPathConfig: EvWatchPathConfig? = null
)
