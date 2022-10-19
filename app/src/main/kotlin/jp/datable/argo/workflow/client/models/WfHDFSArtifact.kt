package jp.datable.argo.workflow.client.models

data class WfHDFSArtifact(
    val path: String,
    val addresses: List<String>? = null,
    val force: Boolean? = null,
    val hdfsUser: String? = null,
    val krbCCacheSecret: CoreSecretKeySelector? = null,
    val krbConfigConfigMap: CoreConfigMapKeySelector? = null,
    val krbKeytabSecret: CoreSecretKeySelector? = null,
    val krbRealm: String? = null,
    val krbServicePrincipalName: String? = null,
    val krbUsername: String? = null
)
