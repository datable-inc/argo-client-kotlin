package jp.datable.argo.workflow.client.models

data class CoreNodeSelectorRequirement(
    val key: String,
    val `operator`: CoreNodeSelectorRequirement.`Operator`,
    val propertyValues: List<String>? = null
) {

    /**
     * Represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists,
     * DoesNotExist. Gt, and Lt. Possible enum values: - `\"DoesNotExist\"` - `\"Exists\"` - `\"Gt\"`
     * - `\"In\"` - `\"Lt\"` - `\"NotIn\"`
     *
     * Values: doesNotExist,exists,gt,`in`,lt,notIn
     */
    enum class `Operator`(val value: String) {
        doesNotExist("DoesNotExist"),
        exists("Exists"),
        gt("Gt"),
        `in`("In"),
        lt("Lt"),
        notIn("NotIn")
    }
}
