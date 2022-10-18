package jp.datable.argo.workflow.client.models

data class CoreToleration(
    val effect: Effect?,
    val key: String?,
    val `operator`: `Operator`?,
    val tolerationSeconds: Int?,
    val `value`: String?
) {

    /**
     * Effect indicates the taint effect to match. Empty means match all taint effects. When
     * specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute. Possible enum values:
     * - `\"NoExecute\"` Evict any already-running pods that do not tolerate the taint. Currently
     * enforced by NodeController. - `\"NoSchedule\"` Do not allow new pods to schedule onto the node
     * unless they tolerate the taint, but allow all pods submitted to Kubelet without going through
     * the scheduler to start, and allow all already-running pods to continue running. Enforced by the
     * scheduler. - `\"PreferNoSchedule\"` Like TaintEffectNoSchedule, but the scheduler tries not to
     * schedule new pods onto the node, rather than prohibiting new pods from scheduling onto the node
     * entirely. Enforced by the scheduler.
     *
     * Values: noExecute,noSchedule,preferNoSchedule
     */
    enum class Effect(val value: String) {
        noExecute("NoExecute"),
        noSchedule("NoSchedule"),
        preferNoSchedule("PreferNoSchedule")
    }
    /**
     * Operator represents a key's relationship to the value. Valid operators are Exists and Equal.
     * Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all
     * taints of a particular category. Possible enum values: - `\"Equal\"` - `\"Exists\"`
     *
     * Values: equal,exists
     */
    enum class `Operator`(val value: String) {
        equal("Equal"),
        exists("Exists")
    }
}
