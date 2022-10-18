package jp.datable.argo.workflow.client.models

data class EvBitbucketServerEventSource(
    val accessToken: CoreSecretKeySelector?,
    val bitbucketserverBaseURL: String?,
    val deleteHookOnFinish: Boolean?,
    val events: List<String>?,
    val filter: EvEventSourceFilter?,
    val metadata: Map<String, String>?,
    val projectKey: String?,
    val repositories: List<EvBitbucketServerRepository>?,
    val repositorySlug: String?,
    val webhook: EvWebhookContext?,
    val webhookSecret: CoreSecretKeySelector?
)
