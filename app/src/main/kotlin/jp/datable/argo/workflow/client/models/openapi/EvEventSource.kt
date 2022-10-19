package jp.datable.argo.workflow.client.models.openapi

data class EvEventSource(
    val metadata: MetaObjectMeta? = null,
    val spec: EvEventSourceSpec? = null,
    val status: EvEventSourceStatus? = null
)
