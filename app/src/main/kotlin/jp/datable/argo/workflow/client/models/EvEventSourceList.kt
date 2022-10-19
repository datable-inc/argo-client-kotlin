package jp.datable.argo.workflow.client.models

data class EvEventSourceList(
    val items: List<EvEventSource>? = null,
    val metadata: MetaListMeta? = null
)
