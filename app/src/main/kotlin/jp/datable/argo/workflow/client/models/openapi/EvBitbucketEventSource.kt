package jp.datable.argo.workflow.client.models.openapi

data class EvBitbucketEventSource(
    val auth: EvBitbucketAuth? = null,
    val deleteHookOnFinish: Boolean? = null,
    val events: List<String>? = null,
    val filter: EvEventSourceFilter? = null,
    val metadata: Map<String, String>? = null,
    val owner: String? = null,
    val projectKey: String? = null,
    val repositories: List<EvBitbucketRepository>? = null,
    val repositorySlug: String? = null,
    val webhook: EvWebhookContext? = null
)
