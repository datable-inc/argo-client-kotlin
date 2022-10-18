package jp.datable.argo.workflow.client.models

data class WfMemoizationStatus(val cacheName: String, val hit: Boolean, val key: String)
