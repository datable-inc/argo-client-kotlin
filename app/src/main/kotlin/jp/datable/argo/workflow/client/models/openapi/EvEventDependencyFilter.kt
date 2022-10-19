package jp.datable.argo.workflow.client.models.openapi

data class EvEventDependencyFilter(
    val context: EvEventContext? = null,
    val `data`: List<EvDataFilter>? = null,
    val dataLogicalOperator: String? = null,
    val exprLogicalOperator: String? = null,
    val exprs: List<EvExprFilter>? = null,
    val script: String? = null,
    val time: EvTimeFilter? = null
)
