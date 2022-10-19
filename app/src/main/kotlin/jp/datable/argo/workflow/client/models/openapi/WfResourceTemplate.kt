package jp.datable.argo.workflow.client.models.openapi

data class WfResourceTemplate(
    val action: String,
    val failureCondition: String? = null,
    val flags: List<String>? = null,
    val manifest: String? = null,
    val manifestFrom: WfManifestFrom? = null,
    val mergeStrategy: String? = null,
    val setOwnerReference: Boolean? = null,
    val successCondition: String? = null
)
