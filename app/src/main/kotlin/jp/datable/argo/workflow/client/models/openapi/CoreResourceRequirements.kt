package jp.datable.argo.workflow.client.models.openapi

data class CoreResourceRequirements(
    val limits: Map<String, String>? = null,
    val requests: Map<String, String>? = null
)
