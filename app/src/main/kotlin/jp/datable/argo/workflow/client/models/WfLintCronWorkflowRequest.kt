package jp.datable.argo.workflow.client.models

data class WfLintCronWorkflowRequest(
    val cronWorkflow: WfCronWorkflow? = null,
    val namespace: String? = null
)
