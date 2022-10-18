package jp.datable.argo.workflow.client.models

data class WfInfoResponse(
    val links: List<WfLink>?,
    val managedNamespace: String?,
    val modals: Map<String, Boolean>?,
    val navColor: String?
)
