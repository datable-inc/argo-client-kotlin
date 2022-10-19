package jp.datable.argo.workflow.client.models.openapi

data class WfWorkflowTaskSetStatus(val nodes: Map<String, WfNodeResult>? = null)
