package jp.datable.argo.workflow.client.models

data class CoreAWSElasticBlockStoreVolumeSource(
    val volumeID: String,
    val fsType: String?,
    val partition: Int?,
    val readOnly: Boolean?
)
