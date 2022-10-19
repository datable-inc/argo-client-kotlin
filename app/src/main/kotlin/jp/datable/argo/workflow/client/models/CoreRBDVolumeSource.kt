package jp.datable.argo.workflow.client.models

data class CoreRBDVolumeSource(
    val image: String,
    val monitors: List<String>,
    val fsType: String? = null,
    val keyring: String? = null,
    val pool: String? = null,
    val readOnly: Boolean? = null,
    val secretRef: CoreLocalObjectReference? = null,
    val user: String? = null
)
