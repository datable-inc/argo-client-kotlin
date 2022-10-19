package jp.datable.argo.workflow.client.models.openapi

data class WfCreateCronWorkflowRequest(
    val createOptions: MetaCreateOptions? = null,
    val cronWorkflow: WfCronWorkflow? = null,
    val namespace: String? = null
)
