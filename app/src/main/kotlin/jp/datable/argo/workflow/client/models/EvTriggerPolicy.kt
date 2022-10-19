package jp.datable.argo.workflow.client.models

data class EvTriggerPolicy(
    val k8s: EvK8SResourcePolicy? = null,
    val status: EvStatusPolicy? = null
)
