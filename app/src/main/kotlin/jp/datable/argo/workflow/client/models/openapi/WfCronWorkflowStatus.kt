package jp.datable.argo.workflow.client.models.openapi

data class WfCronWorkflowStatus(
    val active: List<CoreObjectReference>,
    val conditions: List<WfCondition>,
    val lastScheduledTime: String
)
