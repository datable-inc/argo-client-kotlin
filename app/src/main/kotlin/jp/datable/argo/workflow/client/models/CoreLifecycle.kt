package jp.datable.argo.workflow.client.models

data class CoreLifecycle(val postStart: CoreLifecycleHandler?, val preStop: CoreLifecycleHandler?)
