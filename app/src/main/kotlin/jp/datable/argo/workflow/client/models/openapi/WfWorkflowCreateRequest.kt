package jp.datable.argo.workflow.client.models.openapi

data class WfWorkflowCreateRequest(
    val createOptions: MetaCreateOptions? = null,
    val instanceID: String? = null,
    val namespace: String? = null,
    val serverDryRun: Boolean? = null,
    val workflow: WfWorkflow? = null
)
