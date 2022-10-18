package jp.datable.argo.workflow.client.models

data class WfWorkflowStatus(
    val artifactGCStatus: WfArtGCStatus?,
    val artifactRepositoryRef: WfArtifactRepositoryRefStatus?,
    val compressedNodes: String?,
    val conditions: List<WfCondition>?,
    val estimatedDuration: Int?,
    val finishedAt: java.time.OffsetDateTime?,
    val message: String?,
    val nodes: Map<String, WfNodeStatus>?,
    val offloadNodeStatusVersion: String?,
    val outputs: WfOutputs?,
    val persistentVolumeClaims: List<CoreVolume>?,
    val phase: String?,
    val progress: String?,
    val resourcesDuration: Map<String, Long>?,
    val startedAt: java.time.OffsetDateTime?,
    val storedTemplates: Map<String, WfTemplate>?,
    val storedWorkflowTemplateSpec: WfWorkflowSpec?,
    val synchronization: WfSynchronizationStatus?
)
