package jp.datable.argo.workflow.client.models

data class CoreVolumeProjection(
    val configMap: CoreConfigMapProjection?,
    val downwardAPI: CoreDownwardAPIProjection?,
    val secret: CoreSecretProjection?,
    val serviceAccountToken: CoreServiceAccountTokenProjection?
)
