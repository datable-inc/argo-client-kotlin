package jp.datable.argo.workflow.client.models

data class EvGithubEventSource(
    val active: Boolean?,
    val apiToken: CoreSecretKeySelector?,
    val contentType: String?,
    val deleteHookOnFinish: Boolean?,
    val events: List<String>?,
    val filter: EvEventSourceFilter?,
    val githubApp: EvGithubAppCreds?,
    val githubBaseURL: String?,
    val githubUploadURL: String?,
    val id: String?,
    val insecure: Boolean?,
    val metadata: Map<String, String>?,
    val organizations: List<String>?,
    val owner: String?,
    val repositories: List<EvOwnedRepositories>?,
    val repository: String?,
    val webhook: EvWebhookContext?,
    val webhookSecret: CoreSecretKeySelector?
)
