package jp.datable.argo.workflow.client.models.openapi

data class EvValueFromSource(
    val configMapKeyRef: CoreConfigMapKeySelector? = null,
    val secretKeyRef: CoreSecretKeySelector? = null
)
