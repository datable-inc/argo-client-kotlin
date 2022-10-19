package jp.datable.argo.workflow.client.models

data class CorePersistentVolumeClaimCondition(
    val status: String,
    val type: CorePersistentVolumeClaimCondition.Type,
    val lastProbeTime: String? = null,
    val lastTransitionTime: String? = null,
    val message: String? = null,
    val reason: String? = null
) {

    /**
     * ```
     *    Possible enum values:  - `\"FileSystemResizePending\"` - controller resize is finished and a file system resize is pending on node  - `\"Resizing\"` - a user trigger resize of pvc has been started
     * ```
     * Values: fileSystemResizePending,resizing
     */
    enum class Type(val value: String) {
        fileSystemResizePending("FileSystemResizePending"),
        resizing("Resizing")
    }
}
