package jp.datable.argo.workflow.client.models

data class EvService(val clusterIP: String? = null, val ports: List<CoreServicePort>? = null)
