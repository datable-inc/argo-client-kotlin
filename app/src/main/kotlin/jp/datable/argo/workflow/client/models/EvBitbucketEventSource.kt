package jp.datable.argo.workflow.client.models

data class EvBitbucketEventSource(
    val auth: EvBitbucketAuth?,
    val deleteHookOnFinish: Boolean?,
    val events: List<String>?,
    val filter: EvEventSourceFilter?,
    val metadata: Map<String, String>?,
    val owner: String?,
    val projectKey: String?,
    val repositories: List<EvBitbucketRepository>?,
    val repositorySlug: String?,
    val webhook: EvWebhookContext?
)
