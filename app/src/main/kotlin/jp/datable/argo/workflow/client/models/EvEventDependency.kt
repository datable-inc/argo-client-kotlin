package jp.datable.argo.workflow.client.models

data class EvEventDependency(
    val eventName: String?,
    val eventSourceName: String?,
    val filters: EvEventDependencyFilter?,
    val filtersLogicalOperator: String?,
    val name: String?,
    val transform: EvEventDependencyTransformer?
)
