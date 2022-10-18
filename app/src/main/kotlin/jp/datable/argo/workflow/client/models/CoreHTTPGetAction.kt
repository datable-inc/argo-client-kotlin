package jp.datable.argo.workflow.client.models

data class CoreHTTPGetAction(
    val port: String,
    val host: String?,
    val httpHeaders: List<CoreHTTPHeader>?,
    val path: String?,
    val scheme: Scheme?
) {

    /**
     * Scheme to use for connecting to the host. Defaults to HTTP. Possible enum values: - `\"HTTP\"`
     * means that the scheme used will be http:// - `\"HTTPS\"` means that the scheme used will be
     * https://
     *
     * Values: hTTP,hTTPS
     */
    enum class Scheme(val value: String) {
        hTTP("HTTP"),
        hTTPS("HTTPS")
    }
}
