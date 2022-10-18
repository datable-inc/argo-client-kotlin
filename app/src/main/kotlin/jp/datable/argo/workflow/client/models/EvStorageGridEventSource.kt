package jp.datable.argo.workflow.client.models

data class EvStorageGridEventSource(
    val apiURL: String?,
    val authToken: CoreSecretKeySelector?,
    val bucket: String?,
    val events: List<String>?,
    val filter: EvStorageGridFilter?,
    val metadata: Map<String, String>?,
    val region: String?,
    val topicArn: String?,
    val webhook: EvWebhookContext?
)
