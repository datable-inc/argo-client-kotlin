package jp.datable.argo.workflow.client.models.openapi

data class CoreEnvVar(
    val name: String,
    val `value`: String? = null,
    val valueFrom: CoreEnvVarSource? = null
)
