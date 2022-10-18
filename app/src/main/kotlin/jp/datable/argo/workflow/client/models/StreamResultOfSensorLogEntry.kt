package jp.datable.argo.workflow.client.models

data class StreamResultOfSensorLogEntry(
    val error: GrpcgatewayruntimeStreamError?,
    val result: SensorLogEntry?
)
