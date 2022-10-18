package jp.datable.argo.workflow.client.models

data class CorePodDNSConfig(
    val nameservers: List<String>?,
    val options: List<CorePodDNSConfigOption>?,
    val searches: List<String>?
)
