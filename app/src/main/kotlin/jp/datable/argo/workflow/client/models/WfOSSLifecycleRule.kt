package jp.datable.argo.workflow.client.models

data class WfOSSLifecycleRule(
    val markDeletionAfterDays: Int? = null,
    val markInfrequentAccessAfterDays: Int? = null
)
