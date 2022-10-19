package jp.datable.argo.workflow.client.models

data class EvK8SResourcePolicy(
    val backoff: EvBackoff? = null,
    val errorOnBackoffTimeout: Boolean? = null,
    val labels: Map<String, String>? = null
)
