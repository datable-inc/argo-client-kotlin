package jp.datable.argo.workflow.client.models

data class EvOpenWhiskTrigger(
    val actionName: String?,
    val authToken: CoreSecretKeySelector?,
    val host: String?,
    val namespace: String?,
    val parameters: List<EvTriggerParameter>?,
    val payload: List<EvTriggerParameter>?,
    val version: String?
)
