package jp.datable.argo.workflow.client.models

data class EvValueFromSource(
    val configMapKeyRef: CoreConfigMapKeySelector? = null,
    val secretKeyRef: CoreSecretKeySelector? = null
)
