package jp.datable.argo.workflow.client.models

data class EvSensorSpec(
    val dependencies: List<EvEventDependency>?,
    val errorOnFailedRound: Boolean?,
    val eventBusName: String?,
    val replicas: Int?,
    val template: EvTemplate?,
    val triggers: List<EvTrigger>?
)
