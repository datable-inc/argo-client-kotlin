package jp.datable.argo.workflow.client.models

data class CorePodDNSConfig(
    val nameservers: List<String>? = null,
    val options: List<CorePodDNSConfigOption>? = null,
    val searches: List<String>? = null
)
