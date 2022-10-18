package jp.datable.argo.workflow.client.models

data class EvSlackTrigger(
    val channel: String?,
    val message: String?,
    val parameters: List<EvTriggerParameter>?,
    val slackToken: CoreSecretKeySelector?
)
