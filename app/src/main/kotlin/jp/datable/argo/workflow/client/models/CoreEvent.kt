package jp.datable.argo.workflow.client.models

data class CoreEvent(
    val involvedObject: CoreObjectReference,
    val metadata: MetaObjectMeta,
    val action: String? = null,
    val apiVersion: String? = null,
    val count: Int? = null,
    val eventTime: String? = null,
    val firstTimestamp: String? = null,
    val kind: String? = null,
    val lastTimestamp: String? = null,
    val message: String? = null,
    val reason: String? = null,
    val related: CoreObjectReference? = null,
    val reportingComponent: String? = null,
    val reportingInstance: String? = null,
    val series: CoreEventSeries? = null,
    val source: CoreEventSource? = null,
    val type: String? = null
)
