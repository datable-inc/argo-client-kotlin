package jp.datable.argo.workflow.client.models

data class CoreResourceRequirements(
    val limits: Map<String, String>?,
    val requests: Map<String, String>?
)
