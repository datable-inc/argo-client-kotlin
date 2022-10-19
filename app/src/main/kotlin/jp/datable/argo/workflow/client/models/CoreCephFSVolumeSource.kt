package jp.datable.argo.workflow.client.models

data class CoreCephFSVolumeSource(
    val monitors: List<String>,
    val path: String? = null,
    val readOnly: Boolean? = null,
    val secretFile: String? = null,
    val secretRef: CoreLocalObjectReference? = null,
    val user: String? = null
)
