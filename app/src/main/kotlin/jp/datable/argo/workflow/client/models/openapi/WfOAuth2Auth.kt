package jp.datable.argo.workflow.client.models.openapi

data class WfOAuth2Auth(
    val clientIDSecret: CoreSecretKeySelector? = null,
    val clientSecretSecret: CoreSecretKeySelector? = null,
    val endpointParams: List<WfOAuth2EndpointParam>? = null,
    val scopes: List<String>? = null,
    val tokenURLSecret: CoreSecretKeySelector? = null
)
