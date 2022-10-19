package jp.datable.argo.workflow.client.models

data class EvTemplate(
    val affinity: CoreAffinity? = null,
    val container: CoreContainer? = null,
    val imagePullSecrets: List<CoreLocalObjectReference>? = null,
    val metadata: EvMetadata? = null,
    val nodeSelector: Map<String, String>? = null,
    val priority: Int? = null,
    val priorityClassName: String? = null,
    val securityContext: CorePodSecurityContext? = null,
    val serviceAccountName: String? = null,
    val tolerations: List<CoreToleration>? = null,
    val volumes: List<CoreVolume>? = null
)
