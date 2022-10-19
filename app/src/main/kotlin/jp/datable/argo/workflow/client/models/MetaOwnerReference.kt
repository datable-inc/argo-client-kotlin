package jp.datable.argo.workflow.client.models

data class MetaOwnerReference(
    val apiVersion: String,
    val kind: String,
    val name: String,
    val uid: String,
    val blockOwnerDeletion: Boolean? = null,
    val controller: Boolean? = null
)
