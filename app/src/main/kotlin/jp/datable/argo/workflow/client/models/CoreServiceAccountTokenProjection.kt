package jp.datable.argo.workflow.client.models

data class CoreServiceAccountTokenProjection(
    val path: String,
    val audience: String?,
    val expirationSeconds: Int?
)
