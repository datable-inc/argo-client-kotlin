package jp.datable.argo.workflow.client.models.openapi

data class EvStorageGridEventSource(
    val apiURL: String? = null,
    val authToken: CoreSecretKeySelector? = null,
    val bucket: String? = null,
    val events: List<String>? = null,
    val filter: EvStorageGridFilter? = null,
    val metadata: Map<String, String>? = null,
    val region: String? = null,
    val topicArn: String? = null,
    val webhook: EvWebhookContext? = null
)
