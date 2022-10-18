package jp.datable.argo.workflow.client.models

data class CoreEvent(
    val involvedObject: CoreObjectReference,
    val metadata: MetaObjectMeta,
    val action: String?,
    val apiVersion: String?,
    val count: Int?,
    val eventTime: String?,
    val firstTimestamp: String?,
    val kind: String?,
    val lastTimestamp: String?,
    val message: String?,
    val reason: String?,
    val related: CoreObjectReference?,
    val reportingComponent: String?,
    val reportingInstance: String?,
    val series: CoreEventSeries?,
    val source: CoreEventSource?,
    val type: String?
)
