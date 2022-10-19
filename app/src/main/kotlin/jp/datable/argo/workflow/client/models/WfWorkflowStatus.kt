package jp.datable.argo.workflow.client.models

data class WfWorkflowStatus(
    val artifactGCStatus: WfArtGCStatus? = null,
    val artifactRepositoryRef: WfArtifactRepositoryRefStatus? = null,
    val compressedNodes: String? = null,
    val conditions: List<WfCondition>? = null,
    val estimatedDuration: Int? = null,
    val finishedAt: String? = null,
    val message: String? = null,
    val nodes: Map<String, WfNodeStatus>? = null,
    val offloadNodeStatusVersion: String? = null,
    val outputs: WfOutputs? = null,
    val persistentVolumeClaims: List<CoreVolume>? = null,
    val phase: String? = null,
    val progress: String? = null,
    val resourcesDuration: Map<String, Long>? = null,
    val startedAt: String? = null,
    val storedTemplates: Map<String, WfTemplate>? = null,
    val storedWorkflowTemplateSpec: WfWorkflowSpec? = null,
    val synchronization: WfSynchronizationStatus? = null
)
