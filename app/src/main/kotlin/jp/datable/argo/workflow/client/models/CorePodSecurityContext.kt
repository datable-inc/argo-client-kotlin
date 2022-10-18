package jp.datable.argo.workflow.client.models

data class CorePodSecurityContext(
    val fsGroup: Int?,
    val fsGroupChangePolicy: String?,
    val runAsGroup: Int?,
    val runAsNonRoot: Boolean?,
    val runAsUser: Int?,
    val seLinuxOptions: CoreSELinuxOptions?,
    val seccompProfile: CoreSeccompProfile?,
    val supplementalGroups: List<Long>?,
    val sysctls: List<CoreSysctl>?,
    val windowsOptions: CoreWindowsSecurityContextOptions?
)
