package jp.datable.argo.workflow.client.models

data class WfNodeStatus(
    val id: String,
    val name: String,
    val type: String,
    val boundaryID: String?,
    val children: List<String>?,
    val daemoned: Boolean?,
    val displayName: String?,
    val estimatedDuration: Int?,
    val finishedAt: String?,
    val hostNodeName: String?,
    val inputs: WfInputs?,
    val memoizationStatus: WfMemoizationStatus?,
    val message: String?,
    val outboundNodes: List<String>?,
    val outputs: WfOutputs?,
    val phase: String?,
    val podIP: String?,
    val progress: String?,
    val resourcesDuration: Map<String, Long>?,
    val startedAt: String?,
    val synchronizationStatus: WfNodeSynchronizationStatus?,
    val templateName: String?,
    val templateRef: WfTemplateRef?,
    val templateScope: String?
)
