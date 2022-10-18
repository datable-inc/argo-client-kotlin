package jp.datable.argo.workflow.client.models

data class WfCreateCronWorkflowRequest(
    val createOptions: MetaCreateOptions?,
    val cronWorkflow: WfCronWorkflow?,
    val namespace: String?
)
