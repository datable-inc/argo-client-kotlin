package jp.datable.argo.workflow.client.models.openapi

data class WfSemaphoreStatus(
    val holding: List<WfSemaphoreHolding>? = null,
    val waiting: List<WfSemaphoreHolding>? = null
)
