package jp.datable.argo.workflow.client.models

data class CoreServicePort(
    val port: Int,
    val appProtocol: String?,
    val name: String?,
    val nodePort: Int?,
    val protocol: Protocol?,
    val targetPort: String?
) {

    /**
     * The IP protocol for this port. Supports \"TCP\", \"UDP\", and \"SCTP\". Default is TCP.
     * Possible enum values: - `\"SCTP\"` is the SCTP protocol. - `\"TCP\"` is the TCP protocol. -
     * `\"UDP\"` is the UDP protocol.
     *
     * Values: sCTP,tCP,uDP
     */
    enum class Protocol(val value: String) {
        sCTP("SCTP"),
        tCP("TCP"),
        uDP("UDP")
    }
}
