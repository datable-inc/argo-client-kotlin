package jp.datable.argo.workflow.client.models.openapi

data class GrpcgatewayruntimeStreamError(
    val details: List<GoogleprotobufAny>? = null,
    val grpcCode: Int? = null,
    val httpCode: Int? = null,
    val httpStatus: String? = null,
    val message: String? = null
)
