package jp.datable.argo.workflow.client.models.openapi

data class EvPubSubEventSource(
    val credentialSecret: CoreSecretKeySelector? = null,
    val deleteSubscriptionOnFinish: Boolean? = null,
    val filter: EvEventSourceFilter? = null,
    val jsonBody: Boolean? = null,
    val metadata: Map<String, String>? = null,
    val projectID: String? = null,
    val subscriptionID: String? = null,
    val topic: String? = null,
    val topicProjectID: String? = null
)
