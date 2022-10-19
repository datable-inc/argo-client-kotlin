package jp.datable.argo.workflow.client.models.openapi

data class WfHTTP(
    val url: String,
    val body: String? = null,
    val bodyFrom: WfHTTPBodySource? = null,
    val headers: List<WfHTTPHeader>? = null,
    val insecureSkipVerify: Boolean? = null,
    val method: String? = null,
    val successCondition: String? = null,
    val timeoutSeconds: Int? = null
)
