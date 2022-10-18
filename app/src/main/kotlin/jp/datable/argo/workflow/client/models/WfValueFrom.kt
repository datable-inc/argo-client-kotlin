package jp.datable.argo.workflow.client.models

data class WfValueFrom(
    val configMapKeyRef: CoreConfigMapKeySelector?,
    val default: String?,
    val event: String?,
    val expression: String?,
    val jqFilter: String?,
    val jsonPath: String?,
    val parameter: String?,
    val path: String?,
    val supplied: Any?
)
