package jp.datable.argo.workflow.client.models

data class EvGitlabEventSource(
    val accessToken: CoreSecretKeySelector?,
    val deleteHookOnFinish: Boolean?,
    val enableSSLVerification: Boolean?,
    val events: List<String>?,
    val filter: EvEventSourceFilter?,
    val gitlabBaseURL: String?,
    val metadata: Map<String, String>?,
    val projectID: String?,
    val projects: List<String>?,
    val secretToken: CoreSecretKeySelector?,
    val webhook: EvWebhookContext?
)
