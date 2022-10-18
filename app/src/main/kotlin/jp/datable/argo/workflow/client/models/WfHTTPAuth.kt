package jp.datable.argo.workflow.client.models

data class WfHTTPAuth(
    val basicAuth: WfBasicAuth?,
    val clientCert: WfClientCertAuth?,
    val oauth2: WfOAuth2Auth?
)
