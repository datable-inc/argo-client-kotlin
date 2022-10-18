package jp.datable.argo.workflow.client.models

data class WfCronWorkflowStatus(
    val active: List<CoreObjectReference>,
    val conditions: List<WfCondition>,
    val lastScheduledTime: java.time.OffsetDateTime
)
