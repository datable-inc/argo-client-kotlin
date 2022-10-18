package jp.datable.argo.workflow.client.models

data class EvStandardK8STrigger(
    val liveObject: Boolean?,
    val operation: String?,
    val parameters: List<EvTriggerParameter>?,
    val patchStrategy: String?,
    val source: EvArtifactLocation?
)
