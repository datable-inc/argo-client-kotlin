package jp.datable.argo.workflow.client.models

data class GrpcgatewayruntimeError(
    val code: Int?,
    val details: List<GoogleprotobufAny>?,
    val error: String?,
    val message: String?
)
