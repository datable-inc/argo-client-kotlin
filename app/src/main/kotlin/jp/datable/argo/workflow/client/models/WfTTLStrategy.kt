package jp.datable.argo.workflow.client.models

data class WfTTLStrategy(
    val secondsAfterCompletion: Int?,
    val secondsAfterFailure: Int?,
    val secondsAfterSuccess: Int?
)
