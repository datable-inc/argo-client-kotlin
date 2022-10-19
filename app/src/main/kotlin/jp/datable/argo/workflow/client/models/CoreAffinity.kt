package jp.datable.argo.workflow.client.models

data class CoreAffinity(
    val nodeAffinity: CoreNodeAffinity? = null,
    val podAffinity: CorePodAffinity? = null,
    val podAntiAffinity: CorePodAntiAffinity? = null
)
