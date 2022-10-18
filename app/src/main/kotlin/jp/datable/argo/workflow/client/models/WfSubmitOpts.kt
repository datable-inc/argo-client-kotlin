package jp.datable.argo.workflow.client.models

data class WfSubmitOpts(
    val annotations: String?,
    val dryRun: Boolean?,
    val entryPoint: String?,
    val generateName: String?,
    val labels: String?,
    val name: String?,
    val ownerReference: MetaOwnerReference?,
    val parameters: List<String>?,
    val podPriorityClassName: String?,
    val priority: Int?,
    val serverDryRun: Boolean?,
    val serviceAccount: String?
)
