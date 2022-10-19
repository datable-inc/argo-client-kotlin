package jp.datable.argo.workflow.client.models.openapi

data class CorePodSecurityContext(
    val fsGroup: Int? = null,
    val fsGroupChangePolicy: String? = null,
    val runAsGroup: Int? = null,
    val runAsNonRoot: Boolean? = null,
    val runAsUser: Int? = null,
    val seLinuxOptions: CoreSELinuxOptions? = null,
    val seccompProfile: CoreSeccompProfile? = null,
    val supplementalGroups: List<Long>? = null,
    val sysctls: List<CoreSysctl>? = null,
    val windowsOptions: CoreWindowsSecurityContextOptions? = null
)
