package jp.datable.argo.workflow.client.models

data class WfHTTP(
    val url: String,
    val body: String?,
    val bodyFrom: WfHTTPBodySource?,
    val headers: List<WfHTTPHeader>?,
    val insecureSkipVerify: Boolean?,
    val method: String?,
    val successCondition: String?,
    val timeoutSeconds: Int?
)
