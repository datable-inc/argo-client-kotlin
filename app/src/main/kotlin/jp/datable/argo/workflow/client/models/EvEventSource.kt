package jp.datable.argo.workflow.client.models

data class EvEventSource(
    val metadata: MetaObjectMeta? = null,
    val spec: EvEventSourceSpec? = null,
    val status: EvEventSourceStatus? = null
)
