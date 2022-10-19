package jp.datable.argo.workflow.client.models.openapi

data class EvEventDependency(
    val eventName: String? = null,
    val eventSourceName: String? = null,
    val filters: EvEventDependencyFilter? = null,
    val filtersLogicalOperator: String? = null,
    val name: String? = null,
    val transform: EvEventDependencyTransformer? = null
)
