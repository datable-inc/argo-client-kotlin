package jp.datable.argo.workflow.client.models.openapi

data class WfMemoizationStatus(val cacheName: String, val hit: Boolean, val key: String)
