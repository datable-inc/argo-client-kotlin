package jp.datable.argo.workflow.client.models

data class WfPrometheus(
    val help: String,
    val name: String,
    val counter: WfCounter?,
    val gauge: WfGauge?,
    val histogram: WfHistogram?,
    val labels: List<WfMetricLabel>?,
    val `when`: String?
)
