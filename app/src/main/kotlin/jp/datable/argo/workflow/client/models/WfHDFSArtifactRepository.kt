package jp.datable.argo.workflow.client.models

data class WfHDFSArtifactRepository(
    val addresses: List<String>?,
    val force: Boolean?,
    val hdfsUser: String?,
    val krbCCacheSecret: CoreSecretKeySelector?,
    val krbConfigConfigMap: CoreConfigMapKeySelector?,
    val krbKeytabSecret: CoreSecretKeySelector?,
    val krbRealm: String?,
    val krbServicePrincipalName: String?,
    val krbUsername: String?,
    val pathFormat: String?
)
