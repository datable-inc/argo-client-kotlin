package jp.datable.argo.workflow.client.models.openapi

data class CoreEnvFromSource(
    val configMapRef: CoreConfigMapEnvSource? = null,
    val prefix: String? = null,
    val secretRef: CoreSecretEnvSource? = null
)
