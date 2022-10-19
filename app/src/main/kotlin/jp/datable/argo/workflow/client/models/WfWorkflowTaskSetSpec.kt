package jp.datable.argo.workflow.client.models

data class WfWorkflowTaskSetSpec(val tasks: Map<String, WfTemplate>? = null)
