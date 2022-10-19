package jp.datable.argo.workflow.client.models.openapi

data class WfHTTPAuth(
    val basicAuth: WfBasicAuth? = null,
    val clientCert: WfClientCertAuth? = null,
    val oauth2: WfOAuth2Auth? = null
)
