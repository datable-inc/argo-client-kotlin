package jp.datable.argo.workflow.client.models

data class WfClusterWorkflowTemplateCreateRequest(
    val createOptions: MetaCreateOptions?,
    val template: WfClusterWorkflowTemplate?
)
