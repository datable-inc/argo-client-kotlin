package jp.datable.argo.workflow.client.models

data class GrpcgatewayruntimeStreamError(
    val details: List<GoogleprotobufAny>?,
    val grpcCode: Int?,
    val httpCode: Int?,
    val httpStatus: String?,
    val message: String?
)
