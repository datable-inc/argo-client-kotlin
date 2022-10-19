package jp.datable.argo.workflow.client.models.openapi

data class CoreContainerPort(
    val containerPort: Int,
    val hostIP: String? = null,
    val hostPort: Int? = null,
    val name: String? = null,
    val protocol: Protocol? = null
) {

    /**
     * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to \"TCP\". Possible enum values: -
     * `\"SCTP\"` is the SCTP protocol. - `\"TCP\"` is the TCP protocol. - `\"UDP\"` is the UDP
     * protocol.
     *
     * Values: sCTP,tCP,uDP
     */
    enum class Protocol(val value: String) {
        sCTP("SCTP"),
        tCP("TCP"),
        uDP("UDP")
    }
}
