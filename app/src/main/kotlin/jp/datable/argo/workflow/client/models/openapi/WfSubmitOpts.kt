package jp.datable.argo.workflow.client.models.openapi

data class WfSubmitOpts(
    val annotations: String? = null,
    val dryRun: Boolean? = null,
    val entryPoint: String? = null,
    val generateName: String? = null,
    val labels: String? = null,
    val name: String? = null,
    val ownerReference: MetaOwnerReference? = null,
    val parameters: List<String>? = null,
    val podPriorityClassName: String? = null,
    val priority: Int? = null,
    val serverDryRun: Boolean? = null,
    val serviceAccount: String? = null
)
