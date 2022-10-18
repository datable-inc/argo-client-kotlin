package jp.datable.argo.workflow.client.models

data class CoreCephFSVolumeSource(
    val monitors: List<String>,
    val path: String?,
    val readOnly: Boolean?,
    val secretFile: String?,
    val secretRef: CoreLocalObjectReference?,
    val user: String?
)
