package jp.datable.argo.workflow.client.models

data class EvBackoff(
    val duration: EvInt64OrString?,
    val factor: EvAmount?,
    val jitter: EvAmount?,
    val steps: Int?
)
