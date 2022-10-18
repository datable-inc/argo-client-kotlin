package jp.datable.argo.workflow.client.models

data class WfUpdateCronWorkflowRequest(
    val cronWorkflow: WfCronWorkflow?,
    val name: String?,
    val namespace: String?
)
