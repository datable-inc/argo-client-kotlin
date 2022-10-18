package jp.datable.argo.workflow.client.models

data class EvEventContext(
    val datacontenttype: String?,
    val id: String?,
    val source: String?,
    val specversion: String?,
    val subject: String?,
    val time: java.time.OffsetDateTime?,
    val type: String?
)
