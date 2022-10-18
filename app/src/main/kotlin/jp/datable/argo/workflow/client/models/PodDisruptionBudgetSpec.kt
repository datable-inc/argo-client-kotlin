package jp.datable.argo.workflow.client.models

data class PodDisruptionBudgetSpec(
    val maxUnavailable: String?,
    val minAvailable: String?,
    val selector: MetaLabelSelector?
)
