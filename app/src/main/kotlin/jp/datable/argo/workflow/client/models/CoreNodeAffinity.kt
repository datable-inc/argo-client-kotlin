package jp.datable.argo.workflow.client.models

data class CoreNodeAffinity(
    val preferredDuringSchedulingIgnoredDuringExecution: List<CorePreferredSchedulingTerm>? = null,
    val requiredDuringSchedulingIgnoredDuringExecution: CoreNodeSelector? = null
)
