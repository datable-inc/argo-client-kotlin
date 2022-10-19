package jp.datable.argo.workflow.client.models

data class EvCalendarEventSource(
    val exclusionDates: List<String>? = null,
    val filter: EvEventSourceFilter? = null,
    val interval: String? = null,
    val metadata: Map<String, String>? = null,
    val persistence: EvEventPersistence? = null,
    val schedule: String? = null,
    val timezone: String? = null
)
