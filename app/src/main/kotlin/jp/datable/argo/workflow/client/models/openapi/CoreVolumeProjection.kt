package jp.datable.argo.workflow.client.models.openapi

data class CoreVolumeProjection(
    val configMap: CoreConfigMapProjection? = null,
    val downwardAPI: CoreDownwardAPIProjection? = null,
    val secret: CoreSecretProjection? = null,
    val serviceAccountToken: CoreServiceAccountTokenProjection? = null
)
