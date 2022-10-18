package jp.datable.argo.workflow.client.models

data class CorePodAntiAffinity(
    val preferredDuringSchedulingIgnoredDuringExecution: List<CoreWeightedPodAffinityTerm>?,
    val requiredDuringSchedulingIgnoredDuringExecution: List<CorePodAffinityTerm>?
)
