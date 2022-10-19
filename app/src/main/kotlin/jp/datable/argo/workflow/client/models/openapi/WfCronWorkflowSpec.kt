package jp.datable.argo.workflow.client.models.openapi

data class WfCronWorkflowSpec(
    val schedule: String,
    val workflowSpec: WfWorkflowSpec,
    val concurrencyPolicy: String? = null,
    val failedJobsHistoryLimit: Int? = null,
    val startingDeadlineSeconds: Int? = null,
    val successfulJobsHistoryLimit: Int? = null,
    val `suspend`: Boolean? = null,
    val timezone: String? = null,
    val workflowMetadata: MetaObjectMeta? = null
)
