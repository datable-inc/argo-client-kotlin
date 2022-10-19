package jp.datable.argo.workflow.client.models.openapi

data class CoreProbe(
    val exec: CoreExecAction? = null,
    val failureThreshold: Int? = null,
    val grpc: CoreGRPCAction? = null,
    val httpGet: CoreHTTPGetAction? = null,
    val initialDelaySeconds: Int? = null,
    val periodSeconds: Int? = null,
    val successThreshold: Int? = null,
    val tcpSocket: CoreTCPSocketAction? = null,
    val terminationGracePeriodSeconds: Int? = null,
    val timeoutSeconds: Int? = null
)
