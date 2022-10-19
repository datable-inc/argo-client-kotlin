package jp.datable.argo.workflow.client.models

data class WfMutexStatus(
    val holding: List<WfMutexHolding>? = null,
    val waiting: List<WfMutexHolding>? = null
)
