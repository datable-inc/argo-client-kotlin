package jp.datable.argo.workflow.client.models.openapi

data class WfSynchronizationStatus(
    val mutex: WfMutexStatus? = null,
    val semaphore: WfSemaphoreStatus? = null
)
