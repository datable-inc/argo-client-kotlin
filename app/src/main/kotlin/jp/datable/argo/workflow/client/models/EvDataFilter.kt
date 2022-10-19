package jp.datable.argo.workflow.client.models

data class EvDataFilter(
    val comparator: String? = null,
    val path: String? = null,
    val template: String? = null,
    val type: String? = null,
    val `value`: List<String>? = null
)
