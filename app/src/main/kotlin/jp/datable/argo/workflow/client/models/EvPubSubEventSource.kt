package jp.datable.argo.workflow.client.models

data class EvPubSubEventSource(
    val credentialSecret: CoreSecretKeySelector?,
    val deleteSubscriptionOnFinish: Boolean?,
    val filter: EvEventSourceFilter?,
    val jsonBody: Boolean?,
    val metadata: Map<String, String>?,
    val projectID: String?,
    val subscriptionID: String?,
    val topic: String?,
    val topicProjectID: String?
)
