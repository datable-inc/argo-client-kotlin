package jp.datable.argo.workflow.client.models

/**
 * Ref. https://argoproj.github.io/argo-workflows/fields/#cronworkflowstatus
 */
data class CronWorkflowStatus(
    val lastScheduleTime: String? // TODO: must be handled Time type
)
