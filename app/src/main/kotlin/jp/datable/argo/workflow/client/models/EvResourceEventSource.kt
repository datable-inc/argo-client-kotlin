package jp.datable.argo.workflow.client.models

data class EvResourceEventSource(
    val eventTypes: List<String>?,
    val filter: EvResourceFilter?,
    val groupVersionResource: MetaGroupVersionResource?,
    val metadata: Map<String, String>?,
    val namespace: String?
)
