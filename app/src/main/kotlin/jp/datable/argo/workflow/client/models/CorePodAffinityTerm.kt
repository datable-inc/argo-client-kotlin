package jp.datable.argo.workflow.client.models

data class CorePodAffinityTerm(
    val topologyKey: String,
    val labelSelector: MetaLabelSelector? = null,
    val namespaceSelector: MetaLabelSelector? = null,
    val namespaces: List<String>? = null
)
