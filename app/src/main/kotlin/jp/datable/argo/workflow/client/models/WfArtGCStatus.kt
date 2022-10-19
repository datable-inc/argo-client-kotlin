package jp.datable.argo.workflow.client.models

data class WfArtGCStatus(
    val notSpecified: Boolean? = null,
    val podsRecouped: Map<String, Boolean>? = null,
    val strategiesProcessed: Map<String, Boolean>? = null
)
