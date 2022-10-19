package jp.datable.argo.workflow.client.models.openapi

data class WfDAGTemplate(
    val tasks: List<WfDAGTask>,
    val failFast: Boolean? = null,
    val target: String? = null
)
