package jp.datable.argo.workflow.client.models

data class CoreProbe(
    val exec: CoreExecAction?,
    val failureThreshold: Int?,
    val grpc: CoreGRPCAction?,
    val httpGet: CoreHTTPGetAction?,
    val initialDelaySeconds: Int?,
    val periodSeconds: Int?,
    val successThreshold: Int?,
    val tcpSocket: CoreTCPSocketAction?,
    val terminationGracePeriodSeconds: Int?,
    val timeoutSeconds: Int?
)
