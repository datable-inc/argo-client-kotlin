package jp.datable.argo.workflow.client.models

data class CoreWindowsSecurityContextOptions(
    val gmsaCredentialSpec: String? = null,
    val gmsaCredentialSpecName: String? = null,
    val hostProcess: Boolean? = null,
    val runAsUserName: String? = null
)
