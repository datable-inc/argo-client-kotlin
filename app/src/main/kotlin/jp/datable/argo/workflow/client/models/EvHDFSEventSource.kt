package jp.datable.argo.workflow.client.models

data class EvHDFSEventSource(
    val addresses: List<String>?,
    val checkInterval: String?,
    val filter: EvEventSourceFilter?,
    val hdfsUser: String?,
    val krbCCacheSecret: CoreSecretKeySelector?,
    val krbConfigConfigMap: CoreConfigMapKeySelector?,
    val krbKeytabSecret: CoreSecretKeySelector?,
    val krbRealm: String?,
    val krbServicePrincipalName: String?,
    val krbUsername: String?,
    val metadata: Map<String, String>?,
    val type: String?,
    val watchPathConfig: EvWatchPathConfig?
)
