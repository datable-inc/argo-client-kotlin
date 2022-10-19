package jp.datable.argo.workflow.client.models

data class StreamResultOfSensorLogEntry(
    val error: GrpcgatewayruntimeStreamError? = null,
    val result: SensorLogEntry? = null
)
