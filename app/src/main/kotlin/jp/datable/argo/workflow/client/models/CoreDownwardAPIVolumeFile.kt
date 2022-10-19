package jp.datable.argo.workflow.client.models

data class CoreDownwardAPIVolumeFile(
    val path: String,
    val fieldRef: CoreObjectFieldSelector? = null,
    val mode: Int? = null,
    val resourceFieldRef: CoreResourceFieldSelector? = null
)
