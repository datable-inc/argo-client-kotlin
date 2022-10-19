package jp.datable.argo.workflow.client.models.openapi

data class CoreLifecycle(
    val postStart: CoreLifecycleHandler? = null,
    val preStop: CoreLifecycleHandler? = null
)
