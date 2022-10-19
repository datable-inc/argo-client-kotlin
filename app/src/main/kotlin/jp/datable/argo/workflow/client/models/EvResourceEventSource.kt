package jp.datable.argo.workflow.client.models

data class EvResourceEventSource(
    val eventTypes: List<String>? = null,
    val filter: EvResourceFilter? = null,
    val groupVersionResource: MetaGroupVersionResource? = null,
    val metadata: Map<String, String>? = null,
    val namespace: String? = null
)
