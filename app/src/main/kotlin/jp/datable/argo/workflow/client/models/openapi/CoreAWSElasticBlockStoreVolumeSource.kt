package jp.datable.argo.workflow.client.models.openapi

data class CoreAWSElasticBlockStoreVolumeSource(
    val volumeID: String,
    val fsType: String? = null,
    val partition: Int? = null,
    val readOnly: Boolean? = null
)
