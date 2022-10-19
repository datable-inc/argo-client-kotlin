package jp.datable.argo.workflow.client.models.openapi

data class EvBackoff(
    val duration: EvInt64OrString? = null,
    val factor: EvAmount? = null,
    val jitter: EvAmount? = null,
    val steps: Int? = null
)
