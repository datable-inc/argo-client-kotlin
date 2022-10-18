package jp.datable.argo.workflow.client.models

data class CoreLifecycleHandler(
    val exec: CoreExecAction?,
    val httpGet: CoreHTTPGetAction?,
    val tcpSocket: CoreTCPSocketAction?
)
