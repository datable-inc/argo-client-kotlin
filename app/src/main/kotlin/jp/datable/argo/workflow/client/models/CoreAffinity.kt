package jp.datable.argo.workflow.client.models

data class CoreAffinity(
    val nodeAffinity: CoreNodeAffinity?,
    val podAffinity: CorePodAffinity?,
    val podAntiAffinity: CorePodAntiAffinity?
)
