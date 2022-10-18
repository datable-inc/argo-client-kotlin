package jp.datable.argo.workflow.client.models

data class WfMemoize(val cache: WfCache, val key: String, val maxAge: String)
