package jp.datable.argo.workflow.client.models

data class CoreRBDVolumeSource(
    val image: String,
    val monitors: List<String>,
    val fsType: String?,
    val keyring: String?,
    val pool: String?,
    val readOnly: Boolean?,
    val secretRef: CoreLocalObjectReference?,
    val user: String?
)
