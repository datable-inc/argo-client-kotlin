package jp.datable.argo.workflow.client.models

data class EvArgoWorkflowTrigger(
    val args: List<String>? = null,
    val operation: String? = null,
    val parameters: List<EvTriggerParameter>? = null,
    val source: EvArtifactLocation? = null
)
