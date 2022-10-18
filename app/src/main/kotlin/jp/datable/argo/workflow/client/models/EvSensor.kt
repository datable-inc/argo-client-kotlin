package jp.datable.argo.workflow.client.models

data class EvSensor(
    val metadata: MetaObjectMeta?,
    val spec: EvSensorSpec?,
    val status: EvSensorStatus?
)
