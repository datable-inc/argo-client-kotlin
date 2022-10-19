package jp.datable.argo.workflow.client.models.openapi

data class EvHDFSEventSource(
    val addresses: List<String>? = null,
    val checkInterval: String? = null,
    val filter: EvEventSourceFilter? = null,
    val hdfsUser: String? = null,
    val krbCCacheSecret: CoreSecretKeySelector? = null,
    val krbConfigConfigMap: CoreConfigMapKeySelector? = null,
    val krbKeytabSecret: CoreSecretKeySelector? = null,
    val krbRealm: String? = null,
    val krbServicePrincipalName: String? = null,
    val krbUsername: String? = null,
    val metadata: Map<String, String>? = null,
    val type: String? = null,
    val watchPathConfig: EvWatchPathConfig? = null
)
