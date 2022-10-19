package jp.datable.argo.workflow.client.models.openapi

data class WfNodeStatus(
    val id: String,
    val name: String,
    val type: String,
    val boundaryID: String? = null,
    val children: List<String>? = null,
    val daemoned: Boolean? = null,
    val displayName: String? = null,
    val estimatedDuration: Int? = null,
    val finishedAt: String? = null,
    val hostNodeName: String? = null,
    val inputs: WfInputs? = null,
    val memoizationStatus: WfMemoizationStatus? = null,
    val message: String? = null,
    val outboundNodes: List<String>? = null,
    val outputs: WfOutputs? = null,
    val phase: String? = null,
    val podIP: String? = null,
    val progress: String? = null,
    val resourcesDuration: Map<String, Long>? = null,
    val startedAt: String? = null,
    val synchronizationStatus: WfNodeSynchronizationStatus? = null,
    val templateName: String? = null,
    val templateRef: WfTemplateRef? = null,
    val templateScope: String? = null
)
