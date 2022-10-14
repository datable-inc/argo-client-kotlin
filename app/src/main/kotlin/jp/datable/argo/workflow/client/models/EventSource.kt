package jp.datable.argo.workflow.client.models

data class EventSource(
    var metadata: ObjectMeta,
    var spec: EventSourceSpec,
)
