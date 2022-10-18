package jp.datable.argo.workflow.client.models

data class WfMutexStatus(val holding: List<WfMutexHolding>?, val waiting: List<WfMutexHolding>?)
