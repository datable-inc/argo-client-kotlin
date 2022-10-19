package jp.datable.argo.workflow.client.models

data class EvOpenWhiskTrigger(
    val actionName: String? = null,
    val authToken: CoreSecretKeySelector? = null,
    val host: String? = null,
    val namespace: String? = null,
    val parameters: List<EvTriggerParameter>? = null,
    val payload: List<EvTriggerParameter>? = null,
    val version: String? = null
)
