package jp.datable.argo.workflow.client.models

data class WfSemaphoreStatus(
    val holding: List<WfSemaphoreHolding>? = null,
    val waiting: List<WfSemaphoreHolding>? = null
)
