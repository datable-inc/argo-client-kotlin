package jp.datable.argo.workflow.client.models

data class WfWorkflowMetadata(
    val annotations: Map<String, String>?,
    val labels: Map<String, String>?,
    val labelsFrom: Map<String, WfLabelValueFrom>?
)
