package jp.datable.argo.workflow.client.models

data class WfWorkflowTemplateUpdateRequest(
    val name: String?,
    val namespace: String?,
    val template: WfWorkflowTemplate?
)
