package jp.datable.argo.workflow.client.models.openapi

data class EvSensor(
    val metadata: MetaObjectMeta? = null,
    val spec: EvSensorSpec? = null,
    val status: EvSensorStatus? = null
)
