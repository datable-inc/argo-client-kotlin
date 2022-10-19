package jp.datable.argo.workflow.client.models.openapi

data class CorePersistentVolumeClaimStatus(
    val accessModes: List<String>? = null,
    val allocatedResources: Map<String, String>? = null,
    val capacity: Map<String, String>? = null,
    val conditions: List<CorePersistentVolumeClaimCondition>? = null,
    val phase: Phase? = null,
    val resizeStatus: String? = null
) {

    /**
     * Phase represents the current phase of PersistentVolumeClaim. Possible enum values: -
     * `\"Bound\"` used for PersistentVolumeClaims that are bound - `\"Lost\"` used for
     * PersistentVolumeClaims that lost their underlying PersistentVolume. The claim was bound to a
     * PersistentVolume and this volume does not exist any longer and all data on it was lost. -
     * `\"Pending\"` used for PersistentVolumeClaims that are not yet bound
     *
     * Values: bound,lost,pending
     */
    enum class Phase(val value: String) {
        bound("Bound"),
        lost("Lost"),
        pending("Pending")
    }
}
