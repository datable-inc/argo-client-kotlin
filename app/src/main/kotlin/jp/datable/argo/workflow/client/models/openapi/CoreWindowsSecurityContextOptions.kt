package jp.datable.argo.workflow.client.models.openapi

data class CoreWindowsSecurityContextOptions(
    val gmsaCredentialSpec: String? = null,
    val gmsaCredentialSpecName: String? = null,
    val hostProcess: Boolean? = null,
    val runAsUserName: String? = null
)
