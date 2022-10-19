package jp.datable.argo.workflow.client.models.openapi

data class WfWorkflowEventBindingSpec(val event: WfEvent, val submit: WfSubmit? = null)
