package jp.datable.argo.workflow.client.models

data class WfGetUserInfoResponse(
    val email: String? = null,
    val emailVerified: Boolean? = null,
    val groups: List<String>? = null,
    val issuer: String? = null,
    val serviceAccountName: String? = null,
    val serviceAccountNamespace: String? = null,
    val subject: String? = null
)
