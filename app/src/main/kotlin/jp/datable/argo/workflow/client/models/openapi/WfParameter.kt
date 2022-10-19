package jp.datable.argo.workflow.client.models.openapi

data class WfParameter(
    val name: String,
    val default: String? = null,
    val description: String? = null,
    val `enum`: List<String>? = null,
    val globalName: String? = null,
    val `value`: String? = null,
    val valueFrom: WfValueFrom? = null
)
