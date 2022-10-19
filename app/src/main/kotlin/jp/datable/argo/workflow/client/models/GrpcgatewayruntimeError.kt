package jp.datable.argo.workflow.client.models

data class GrpcgatewayruntimeError(
    val code: Int? = null,
    val details: List<GoogleprotobufAny>? = null,
    val error: String? = null,
    val message: String? = null
)
