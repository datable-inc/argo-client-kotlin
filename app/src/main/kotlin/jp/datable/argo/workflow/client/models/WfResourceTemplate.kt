package jp.datable.argo.workflow.client.models

data class WfResourceTemplate(
    val action: String,
    val failureCondition: String?,
    val flags: List<String>?,
    val manifest: String?,
    val manifestFrom: WfManifestFrom?,
    val mergeStrategy: String?,
    val setOwnerReference: Boolean?,
    val successCondition: String?
)
