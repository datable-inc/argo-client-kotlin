package jp.datable.argo.workflow.client.models

// TODO: should be improved
class Workflows(val metadata: WorkflowsMetadata?, val items: List<Workflow>) {
    data class WorkflowsMetadata(
        val resourceVersion: String,
    )
}
