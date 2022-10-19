package jp.datable.argo.workflow.client.models.openapi

data class CoreNodeAffinity(
    val preferredDuringSchedulingIgnoredDuringExecution: List<CorePreferredSchedulingTerm>? = null,
    val requiredDuringSchedulingIgnoredDuringExecution: CoreNodeSelector? = null
)
