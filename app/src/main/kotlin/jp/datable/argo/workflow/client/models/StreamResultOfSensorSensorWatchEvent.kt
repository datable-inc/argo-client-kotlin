package jp.datable.argo.workflow.client.models

data class StreamResultOfSensorSensorWatchEvent(
    val error: GrpcgatewayruntimeStreamError?,
    val result: SensorSensorWatchEvent?
)
