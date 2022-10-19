package jp.datable.argo.workflow.client.models.openapi

data class WfArtGCStatus(
    val notSpecified: Boolean? = null,
    val podsRecouped: Map<String, Boolean>? = null,
    val strategiesProcessed: Map<String, Boolean>? = null
)
