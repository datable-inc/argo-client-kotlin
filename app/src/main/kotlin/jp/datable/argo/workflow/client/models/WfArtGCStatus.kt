package jp.datable.argo.workflow.client.models

data class WfArtGCStatus(
    val notSpecified: Boolean?,
    val podsRecouped: Map<String, Boolean>?,
    val strategiesProcessed: Map<String, Boolean>?
)
