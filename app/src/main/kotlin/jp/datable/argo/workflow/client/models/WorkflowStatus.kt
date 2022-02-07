package jp.datable.argo.workflow.client.models

/**
 * Ref. https://argoproj.github.io/argo-workflows/fields/#workflowstatus
 */
data class WorkflowStatus(
    val phase: String?,
    val startedAt: String?, // TODO: must be handled Time type
    val finishedAt: String?, // TODO: must be handled Time type
    val estimatedDuration: Long?,
    val progress: String?
)
