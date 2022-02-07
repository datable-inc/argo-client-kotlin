package jp.datable.argo.workflow.client.models

/**
 * Ref. https://argoproj.github.io/argo-workflows/fields/#cronworkflowspec
 */
data class CronWorkflowSpec(
    val schedule: String,
    val workflowSpec: WorkflowSpec
)
