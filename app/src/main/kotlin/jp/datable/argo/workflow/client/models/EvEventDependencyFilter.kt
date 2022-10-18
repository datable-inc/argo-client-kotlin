package jp.datable.argo.workflow.client.models

data class EvEventDependencyFilter(
    val context: EvEventContext?,
    val `data`: List<EvDataFilter>?,
    val dataLogicalOperator: String?,
    val exprLogicalOperator: String?,
    val exprs: List<EvExprFilter>?,
    val script: String?,
    val time: EvTimeFilter?
)
