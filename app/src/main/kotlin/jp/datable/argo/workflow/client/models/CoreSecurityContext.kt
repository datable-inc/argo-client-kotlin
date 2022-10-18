package jp.datable.argo.workflow.client.models

data class CoreSecurityContext(
    val allowPrivilegeEscalation: Boolean?,
    val capabilities: CoreCapabilities?,
    val privileged: Boolean?,
    val procMount: String?,
    val readOnlyRootFilesystem: Boolean?,
    val runAsGroup: Int?,
    val runAsNonRoot: Boolean?,
    val runAsUser: Int?,
    val seLinuxOptions: CoreSELinuxOptions?,
    val seccompProfile: CoreSeccompProfile?,
    val windowsOptions: CoreWindowsSecurityContextOptions?
)
