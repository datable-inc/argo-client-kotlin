package jp.datable.argo.workflow.client.models

data class WfSynchronizationStatus(val mutex: WfMutexStatus?, val semaphore: WfSemaphoreStatus?)
