package jp.datable.argo.workflow.client.models

data class EvEventPersistence(
    val catchup: EvCatchupConfiguration?,
    val configMap: EvConfigMapPersistence?
)
