package jp.datable.argo.workflow.client.models.openapi

data class WfMemoize(val cache: WfCache, val key: String, val maxAge: String)
