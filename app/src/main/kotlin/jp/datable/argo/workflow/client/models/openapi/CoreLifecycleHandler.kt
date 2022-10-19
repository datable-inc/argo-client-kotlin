package jp.datable.argo.workflow.client.models.openapi

data class CoreLifecycleHandler(
    val exec: CoreExecAction? = null,
    val httpGet: CoreHTTPGetAction? = null,
    val tcpSocket: CoreTCPSocketAction? = null
)
