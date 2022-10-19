package jp.datable.argo.workflow.client.models.openapi

data class WfSynchronization(val mutex: WfMutex? = null, val semaphore: WfSemaphoreRef? = null)
