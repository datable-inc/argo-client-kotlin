package jp.datable.argo.workflow.client.models

data class WfHTTPArtifact(
    val url: String,
    val auth: WfHTTPAuth? = null,
    val headers: List<WfHeader>? = null
)
