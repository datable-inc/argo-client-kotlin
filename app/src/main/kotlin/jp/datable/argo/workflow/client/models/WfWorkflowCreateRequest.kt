package jp.datable.argo.workflow.client.models

data class WfWorkflowCreateRequest(
    val createOptions: MetaCreateOptions?,
    val instanceID: String?,
    val namespace: String?,
    val serverDryRun: Boolean?,
    val workflow: WfWorkflow?
)
