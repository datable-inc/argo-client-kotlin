package jp.datable.argo.workflow.client.models

data class PodDisruptionBudgetSpec(
    val maxUnavailable: String? = null,
    val minAvailable: String? = null,
    val selector: MetaLabelSelector? = null
)
