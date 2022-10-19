package jp.datable.argo.workflow.client.models.openapi

data class WfArchiveStrategy(
    val none: Any? = null,
    val tar: WfTarStrategy? = null,
    val zip: Any? = null
)
