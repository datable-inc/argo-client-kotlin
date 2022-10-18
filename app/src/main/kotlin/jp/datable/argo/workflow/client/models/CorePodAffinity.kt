package jp.datable.argo.workflow.client.models

data class CorePodAffinity(
    val preferredDuringSchedulingIgnoredDuringExecution: List<CoreWeightedPodAffinityTerm>?,
    val requiredDuringSchedulingIgnoredDuringExecution: List<CorePodAffinityTerm>?
)
