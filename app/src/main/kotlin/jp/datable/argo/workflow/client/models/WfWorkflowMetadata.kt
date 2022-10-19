package jp.datable.argo.workflow.client.models

data class WfWorkflowMetadata(
    val annotations: Map<String, String>? = null,
    val labels: Map<String, String>? = null,
    val labelsFrom: Map<String, WfLabelValueFrom>? = null
)
