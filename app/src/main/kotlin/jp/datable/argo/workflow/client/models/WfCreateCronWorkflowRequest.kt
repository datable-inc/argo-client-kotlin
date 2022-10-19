package jp.datable.argo.workflow.client.models

data class WfCreateCronWorkflowRequest(
    val createOptions: MetaCreateOptions? = null,
    val cronWorkflow: WfCronWorkflow? = null,
    val namespace: String? = null
)
