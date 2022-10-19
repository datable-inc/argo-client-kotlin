package jp.datable.argo.workflow.client.models

data class CoreSecurityContext(
    val allowPrivilegeEscalation: Boolean? = null,
    val capabilities: CoreCapabilities? = null,
    val privileged: Boolean? = null,
    val procMount: String? = null,
    val readOnlyRootFilesystem: Boolean? = null,
    val runAsGroup: Int? = null,
    val runAsNonRoot: Boolean? = null,
    val runAsUser: Int? = null,
    val seLinuxOptions: CoreSELinuxOptions? = null,
    val seccompProfile: CoreSeccompProfile? = null,
    val windowsOptions: CoreWindowsSecurityContextOptions? = null
)
