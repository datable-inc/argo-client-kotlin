package jp.datable.argo.workflow.client.models.openapi

data class StreamResultOfSensorSensorWatchEvent(
    val error: GrpcgatewayruntimeStreamError? = null,
    val result: SensorSensorWatchEvent? = null
)
