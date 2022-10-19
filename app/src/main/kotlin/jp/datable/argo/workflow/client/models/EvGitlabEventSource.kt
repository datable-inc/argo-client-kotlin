package jp.datable.argo.workflow.client.models

data class EvGitlabEventSource(
    val accessToken: CoreSecretKeySelector? = null,
    val deleteHookOnFinish: Boolean? = null,
    val enableSSLVerification: Boolean? = null,
    val events: List<String>? = null,
    val filter: EvEventSourceFilter? = null,
    val gitlabBaseURL: String? = null,
    val metadata: Map<String, String>? = null,
    val projectID: String? = null,
    val projects: List<String>? = null,
    val secretToken: CoreSecretKeySelector? = null,
    val webhook: EvWebhookContext? = null
)
