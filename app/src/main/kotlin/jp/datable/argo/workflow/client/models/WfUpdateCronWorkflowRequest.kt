package jp.datable.argo.workflow.client.models

data class WfUpdateCronWorkflowRequest(
    val cronWorkflow: WfCronWorkflow? = null,
    val name: String? = null,
    val namespace: String? = null
)
