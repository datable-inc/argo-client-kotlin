package jp.datable.argo.workflow.client.models

data class CorePersistentVolumeClaimCondition(
    val status: String,
    val type: CorePersistentVolumeClaimCondition.Type,
    val lastProbeTime: java.time.OffsetDateTime?,
    val lastTransitionTime: java.time.OffsetDateTime?,
    val message: String?,
    val reason: String?
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
