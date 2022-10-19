package jp.datable.argo.workflow.client.models

data class EvSensor(
    val metadata: MetaObjectMeta? = null,
    val spec: EvSensorSpec? = null,
    val status: EvSensorStatus? = null
)
