package jp.datable.argo.workflow.client.models

data class WfParameter(
    val name: String,
    val default: String?,
    val description: String?,
    val `enum`: List<String>?,
    val globalName: String?,
    val `value`: String?,
    val valueFrom: WfValueFrom?
)
