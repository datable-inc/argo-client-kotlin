package jp.datable.argo.workflow.client.models

data class EvTemplate(
    val affinity: CoreAffinity?,
    val container: CoreContainer?,
    val imagePullSecrets: List<CoreLocalObjectReference>?,
    val metadata: EvMetadata?,
    val nodeSelector: Map<String, String>?,
    val priority: Int?,
    val priorityClassName: String?,
    val securityContext: CorePodSecurityContext?,
    val serviceAccountName: String?,
    val tolerations: List<CoreToleration>?,
    val volumes: List<CoreVolume>?
)
