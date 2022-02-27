package jp.datable.argo.workflow.client.models

/** Ref. https://argoproj.github.io/argo-workflows/fields/#cronworkflow */
data class CronWorkflow(
    var apiVersion: String?,
    var kind: String?,
    var metadata: ObjectMeta,
    var spec: CronWorkflowSpec,
    var status: CronWorkflowStatus?
)
