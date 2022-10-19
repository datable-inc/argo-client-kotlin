package jp.datable.argo.workflow.client.models

data class CoreEnvVarSource(
    val configMapKeyRef: CoreConfigMapKeySelector? = null,
    val fieldRef: CoreObjectFieldSelector? = null,
    val resourceFieldRef: CoreResourceFieldSelector? = null,
    val secretKeyRef: CoreSecretKeySelector? = null
)
