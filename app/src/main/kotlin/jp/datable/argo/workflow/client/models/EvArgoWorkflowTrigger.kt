package jp.datable.argo.workflow.client.models

data class EvArgoWorkflowTrigger(
    val args: List<String>?,
    val operation: String?,
    val parameters: List<EvTriggerParameter>?,
    val source: EvArtifactLocation?
)
