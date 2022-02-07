package jp.datable.argo.workflow.client.models

/**
 * Ref. https://argoproj.github.io/argo-workflows/fields/#workflow
 */
data class Workflow(
    var apiVersion: String?,
    var kind: String?,
    var metadata: ObjectMeta,
    var spec: WorkflowSpec,
    var status: WorkflowStatus?
)
