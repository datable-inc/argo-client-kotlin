package jp.datable.argo.workflow.client.models.openapi

data class WfMutexStatus(
    val holding: List<WfMutexHolding>? = null,
    val waiting: List<WfMutexHolding>? = null
)
