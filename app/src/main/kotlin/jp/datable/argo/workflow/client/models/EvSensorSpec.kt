package jp.datable.argo.workflow.client.models

data class EvSensorSpec(
    val dependencies: List<EvEventDependency>? = null,
    val errorOnFailedRound: Boolean? = null,
    val eventBusName: String? = null,
    val replicas: Int? = null,
    val template: EvTemplate? = null,
    val triggers: List<EvTrigger>? = null
)
