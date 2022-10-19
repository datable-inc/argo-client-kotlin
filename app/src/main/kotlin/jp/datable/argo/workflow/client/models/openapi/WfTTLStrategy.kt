package jp.datable.argo.workflow.client.models.openapi

data class WfTTLStrategy(
    val secondsAfterCompletion: Int? = null,
    val secondsAfterFailure: Int? = null,
    val secondsAfterSuccess: Int? = null
)
