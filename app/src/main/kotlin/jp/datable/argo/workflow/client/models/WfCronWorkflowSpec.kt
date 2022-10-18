package jp.datable.argo.workflow.client.models

data class WfCronWorkflowSpec(
    val schedule: String,
    val workflowSpec: WfWorkflowSpec,
    val concurrencyPolicy: String?,
    val failedJobsHistoryLimit: Int?,
    val startingDeadlineSeconds: Int?,
    val successfulJobsHistoryLimit: Int?,
    val `suspend`: Boolean?,
    val timezone: String?,
    val workflowMetadata: MetaObjectMeta?
)
