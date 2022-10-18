package jp.datable.argo.workflow.client.models

data class WfClusterWorkflowTemplateLintRequest(
    val createOptions: MetaCreateOptions?,
    val template: WfClusterWorkflowTemplate?
)
