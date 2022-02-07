package jp.datable.argo.workflow.client.models

import java.util.UUID

data class ObjectMeta(
    val name: String,
    val generateName: String,
    val namespace: String,
    val uid: UUID?,
    val resourceVersion: String?,
    val generation: Long?,
    val creationTimestamp: String?, // TODO: must be handled Time type
    val labels: Map<String, String>,
    val annotations: Map<String, String>?
)
