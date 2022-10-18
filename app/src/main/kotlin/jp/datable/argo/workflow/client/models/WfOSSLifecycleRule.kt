package jp.datable.argo.workflow.client.models

data class WfOSSLifecycleRule(
    val markDeletionAfterDays: Int?,
    val markInfrequentAccessAfterDays: Int?
)
