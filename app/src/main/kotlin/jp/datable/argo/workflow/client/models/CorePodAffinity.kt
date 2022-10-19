package jp.datable.argo.workflow.client.models

data class CorePodAffinity(
    val preferredDuringSchedulingIgnoredDuringExecution: List<CoreWeightedPodAffinityTerm>? = null,
    val requiredDuringSchedulingIgnoredDuringExecution: List<CorePodAffinityTerm>? = null
)
