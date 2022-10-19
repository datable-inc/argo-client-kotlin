package jp.datable.argo.workflow.client.models.openapi

data class MetaObjectMeta(
    val annotations: Map<String, String>? = null,
    val clusterName: String? = null,
    val creationTimestamp: String? = null,
    val deletionGracePeriodSeconds: Int? = null,
    val deletionTimestamp: String? = null,
    val finalizers: List<String>? = null,
    val generateName: String? = null,
    val generation: Int? = null,
    val labels: Map<String, String>? = null,
    val managedFields: List<MetaManagedFieldsEntry>? = null,
    val name: String? = null,
    val namespace: String? = null,
    val ownerReferences: List<MetaOwnerReference>? = null,
    val resourceVersion: String? = null,
    val selfLink: String? = null,
    val uid: String? = null
)
