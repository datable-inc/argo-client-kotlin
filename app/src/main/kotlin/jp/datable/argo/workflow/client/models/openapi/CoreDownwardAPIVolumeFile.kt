package jp.datable.argo.workflow.client.models.openapi

data class CoreDownwardAPIVolumeFile(
    val path: String,
    val fieldRef: CoreObjectFieldSelector? = null,
    val mode: Int? = null,
    val resourceFieldRef: CoreResourceFieldSelector? = null
)
