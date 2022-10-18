package jp.datable.argo.workflow.client.models

data class WfOAuth2Auth(
    val clientIDSecret: CoreSecretKeySelector?,
    val clientSecretSecret: CoreSecretKeySelector?,
    val endpointParams: List<WfOAuth2EndpointParam>?,
    val scopes: List<String>?,
    val tokenURLSecret: CoreSecretKeySelector?
)
