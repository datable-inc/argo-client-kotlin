package jp.datable.argo.workflow.client.models.openapi

data class EvStandardK8STrigger(
    val liveObject: Boolean? = null,
    val operation: String? = null,
    val parameters: List<EvTriggerParameter>? = null,
    val patchStrategy: String? = null,
    val source: EvArtifactLocation? = null
)
