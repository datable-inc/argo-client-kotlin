package jp.datable.argo.workflow.client.models

data class CoreServiceAccountTokenProjection(
    val path: String,
    val audience: String? = null,
    val expirationSeconds: Int? = null
)
