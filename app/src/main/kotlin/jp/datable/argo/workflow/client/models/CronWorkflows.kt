package jp.datable.argo.workflow.client.models

// TODO: should be improved
class CronWorkflows(
    val metadata: CronWorkflowsMetadata?,
    val items: List<Workflow>
) {
    data class CronWorkflowsMetadata(
        val resourceVersion: String,
    )
}
