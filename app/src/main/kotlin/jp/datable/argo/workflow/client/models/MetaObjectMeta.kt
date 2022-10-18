package jp.datable.argo.workflow.client.models

data class MetaObjectMeta(
    val annotations: Map<String, String>?,
    val clusterName: String?,
    val creationTimestamp: java.time.OffsetDateTime?,
    val deletionGracePeriodSeconds: Int?,
    val deletionTimestamp: java.time.OffsetDateTime?,
    val finalizers: List<String>?,
    val generateName: String?,
    val generation: Int?,
    val labels: Map<String, String>?,
    val managedFields: List<MetaManagedFieldsEntry>?,
    val name: String?,
    val namespace: String?,
    val ownerReferences: List<MetaOwnerReference>?,
    val resourceVersion: String?,
    val selfLink: String?,
    val uid: String?
)
