package jp.datable.argo.workflow.client.models.openapi

data class EvEventPersistence(
    val catchup: EvCatchupConfiguration? = null,
    val configMap: EvConfigMapPersistence? = null
)
