package jp.datable.argo.workflow.client.models

data class CorePodAffinityTerm(
    val topologyKey: String,
    val labelSelector: MetaLabelSelector?,
    val namespaceSelector: MetaLabelSelector?,
    val namespaces: List<String>?
)
