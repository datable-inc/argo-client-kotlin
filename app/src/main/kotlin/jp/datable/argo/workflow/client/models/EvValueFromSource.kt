package jp.datable.argo.workflow.client.models

data class EvValueFromSource(
    val configMapKeyRef: CoreConfigMapKeySelector?,
    val secretKeyRef: CoreSecretKeySelector?
)
