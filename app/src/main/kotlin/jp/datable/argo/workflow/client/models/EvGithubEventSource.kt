package jp.datable.argo.workflow.client.models

data class EvGithubEventSource(
    val active: Boolean? = null,
    val apiToken: CoreSecretKeySelector? = null,
    val contentType: String? = null,
    val deleteHookOnFinish: Boolean? = null,
    val events: List<String>? = null,
    val filter: EvEventSourceFilter? = null,
    val githubApp: EvGithubAppCreds? = null,
    val githubBaseURL: String? = null,
    val githubUploadURL: String? = null,
    val id: String? = null,
    val insecure: Boolean? = null,
    val metadata: Map<String, String>? = null,
    val organizations: List<String>? = null,
    val owner: String? = null,
    val repositories: List<EvOwnedRepositories>? = null,
    val repository: String? = null,
    val webhook: EvWebhookContext? = null,
    val webhookSecret: CoreSecretKeySelector? = null
)
