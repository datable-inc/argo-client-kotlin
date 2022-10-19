package jp.datable.argo.workflow.client.models.openapi

data class CoreSeccompProfile(val type: Type, val localhostProfile: String? = null) {

    /**
     * type indicates which kind of seccomp profile will be applied. Valid options are: Localhost - a
     * profile defined in a file on the node should be used. RuntimeDefault - the container runtime
     * default profile should be used. Unconfined - no profile should be applied. Possible enum
     * values: - `\"Localhost\"` indicates a profile defined in a file on the node should be used. The
     * file's location relative to <kubelet-root-dir>/seccomp. - `\"RuntimeDefault\"` represents the
     * default container runtime seccomp profile. - `\"Unconfined\"` indicates no seccomp profile is
     * applied (A.K.A. unconfined).
     *
     * Values: localhost,runtimeDefault,unconfined
     */
    enum class Type(val value: String) {
        localhost("Localhost"),
        runtimeDefault("RuntimeDefault"),
        unconfined("Unconfined")
    }
}
