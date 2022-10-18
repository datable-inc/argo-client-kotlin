package jp.datable.argo.workflow.client.models

data class CoreEnvFromSource(
    val configMapRef: CoreConfigMapEnvSource?,
    val prefix: String?,
    val secretRef: CoreSecretEnvSource?
)
