package jp.datable.argo.workflow.client.models

data class EvSlackTrigger(
    val channel: String? = null,
    val message: String? = null,
    val parameters: List<EvTriggerParameter>? = null,
    val slackToken: CoreSecretKeySelector? = null
)
