package jp.datable.argo.workflow.client.models

data class WfHTTPHeader(
    val name: String,
    val `value`: String? = null,
    val valueFrom: WfHTTPHeaderSource? = null
)
