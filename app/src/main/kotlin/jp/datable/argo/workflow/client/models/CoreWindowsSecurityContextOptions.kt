package jp.datable.argo.workflow.client.models

data class CoreWindowsSecurityContextOptions(
    val gmsaCredentialSpec: String?,
    val gmsaCredentialSpecName: String?,
    val hostProcess: Boolean?,
    val runAsUserName: String?
)
