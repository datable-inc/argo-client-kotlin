package jp.datable.argo.workflow.client.models

data class EvDataFilter(
    val comparator: String?,
    val path: String?,
    val template: String?,
    val type: String?,
    val `value`: List<String>?
)
