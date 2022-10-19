package jp.datable.argo.workflow.client.models

data class WfPrometheus(
    val help: String,
    val name: String,
    val counter: WfCounter? = null,
    val gauge: WfGauge? = null,
    val histogram: WfHistogram? = null,
    val labels: List<WfMetricLabel>? = null,
    val `when`: String? = null
)
