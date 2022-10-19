package jp.datable.argo.workflow.client.models

data class WfInfoResponse(
    val links: List<WfLink>? = null,
    val managedNamespace: String? = null,
    val modals: Map<String, Boolean>? = null,
    val navColor: String? = null
)
