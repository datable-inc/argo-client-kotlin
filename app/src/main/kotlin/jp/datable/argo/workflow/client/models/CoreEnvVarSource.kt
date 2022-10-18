package jp.datable.argo.workflow.client.models

data class CoreEnvVarSource(
    val configMapKeyRef: CoreConfigMapKeySelector?,
    val fieldRef: CoreObjectFieldSelector?,
    val resourceFieldRef: CoreResourceFieldSelector?,
    val secretKeyRef: CoreSecretKeySelector?
)
