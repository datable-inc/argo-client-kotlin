package jp.datable.argo.workflow.client.models

data class WfSemaphoreStatus(
    val holding: List<WfSemaphoreHolding>?,
    val waiting: List<WfSemaphoreHolding>?
)
