package jp.datable.argo.workflow.client.models.openapi

data class WfVersion(
    val buildDate: String,
    val compiler: String,
    val gitCommit: String,
    val gitTag: String,
    val gitTreeState: String,
    val goVersion: String,
    val platform: String,
    val version: String
)
