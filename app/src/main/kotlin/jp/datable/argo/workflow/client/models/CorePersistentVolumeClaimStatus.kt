package jp.datable.argo.workflow.client.models

data class CorePersistentVolumeClaimStatus(
    val accessModes: List<String>?,
    val allocatedResources: Map<String, String>?,
    val capacity: Map<String, String>?,
    val conditions: List<CorePersistentVolumeClaimCondition>?,
    val phase: Phase?,
    val resizeStatus: String?
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
