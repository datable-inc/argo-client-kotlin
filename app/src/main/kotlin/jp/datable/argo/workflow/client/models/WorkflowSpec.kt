package jp.datable.argo.workflow.client.models

/**
 * Ref. https://argoproj.github.io/argo-workflows/fields/#workflowspec
 */
data class WorkflowSpec(
    val templates: List<Template>,
    val entrypoint: String
)
