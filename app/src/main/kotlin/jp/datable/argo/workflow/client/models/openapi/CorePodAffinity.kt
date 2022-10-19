package jp.datable.argo.workflow.client.models.openapi

data class CorePodAffinity(
    val preferredDuringSchedulingIgnoredDuringExecution: List<CoreWeightedPodAffinityTerm>? = null,
    val requiredDuringSchedulingIgnoredDuringExecution: List<CorePodAffinityTerm>? = null
)
