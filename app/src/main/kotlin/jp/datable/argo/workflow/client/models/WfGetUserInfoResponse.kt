package jp.datable.argo.workflow.client.models

data class WfGetUserInfoResponse(
    val email: String?,
    val emailVerified: Boolean?,
    val groups: List<String>?,
    val issuer: String?,
    val serviceAccountName: String?,
    val serviceAccountNamespace: String?,
    val subject: String?
)
