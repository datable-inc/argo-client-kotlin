package jp.datable.argo.workflow.client.models

data class EvResourceFilter(
    val afterStart: Boolean?,
    val createdBy: java.time.OffsetDateTime?,
    val fields: List<EvSelector>?,
    val labels: List<EvSelector>?,
    val prefix: String?
)
