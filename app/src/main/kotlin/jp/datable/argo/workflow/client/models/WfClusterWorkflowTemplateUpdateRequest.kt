package jp.datable.argo.workflow.client.models

data class WfClusterWorkflowTemplateUpdateRequest(
    val name: String?,
    val template: WfClusterWorkflowTemplate?
)
