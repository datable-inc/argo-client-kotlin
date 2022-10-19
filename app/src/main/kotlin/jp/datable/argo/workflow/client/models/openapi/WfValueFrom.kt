package jp.datable.argo.workflow.client.models.openapi

data class WfValueFrom(
    val configMapKeyRef: CoreConfigMapKeySelector? = null,
    val default: String? = null,
    val event: String? = null,
    val expression: String? = null,
    val jqFilter: String? = null,
    val jsonPath: String? = null,
    val parameter: String? = null,
    val path: String? = null,
    val supplied: Any? = null
)
