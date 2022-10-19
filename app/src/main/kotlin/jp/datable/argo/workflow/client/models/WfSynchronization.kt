package jp.datable.argo.workflow.client.models

data class WfSynchronization(val mutex: WfMutex? = null, val semaphore: WfSemaphoreRef? = null)
