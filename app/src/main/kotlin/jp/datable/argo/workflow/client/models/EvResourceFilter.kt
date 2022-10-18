package jp.datable.argo.workflow.client.models

data class EvResourceFilter(
    val afterStart: Boolean?,
    val createdBy: String?,
    val fields: List<EvSelector>?,
    val labels: List<EvSelector>?,
    val prefix: String?
)
