package jp.datable.argo.workflow.client.models

data class EvEventSource(
    val metadata: MetaObjectMeta?,
    val spec: EvEventSourceSpec?,
    val status: EvEventSourceStatus?
)
