package jp.datable.argo.workflow.client.models

data class WfMetadata(
    val annotations: Map<String, String>? = null,
    val labels: Map<String, String>? = null
)
