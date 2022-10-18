package jp.datable.argo.workflow.client.models

data class EvK8SResourcePolicy(
    val backoff: EvBackoff?,
    val errorOnBackoffTimeout: Boolean?,
    val labels: Map<String, String>?
)
