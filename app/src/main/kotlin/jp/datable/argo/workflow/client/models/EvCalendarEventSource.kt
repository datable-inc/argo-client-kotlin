package jp.datable.argo.workflow.client.models

data class EvCalendarEventSource(
    val exclusionDates: List<String>?,
    val filter: EvEventSourceFilter?,
    val interval: String?,
    val metadata: Map<String, String>?,
    val persistence: EvEventPersistence?,
    val schedule: String?,
    val timezone: String?
)
