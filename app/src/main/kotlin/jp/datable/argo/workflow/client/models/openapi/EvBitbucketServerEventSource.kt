package jp.datable.argo.workflow.client.models.openapi

data class EvBitbucketServerEventSource(
    val accessToken: CoreSecretKeySelector? = null,
    val bitbucketserverBaseURL: String? = null,
    val deleteHookOnFinish: Boolean? = null,
    val events: List<String>? = null,
    val filter: EvEventSourceFilter? = null,
    val metadata: Map<String, String>? = null,
    val projectKey: String? = null,
    val repositories: List<EvBitbucketServerRepository>? = null,
    val repositorySlug: String? = null,
    val webhook: EvWebhookContext? = null,
    val webhookSecret: CoreSecretKeySelector? = null
)
