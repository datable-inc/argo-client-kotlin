package jp.datable.argo.workflow.client.models

data class EvAWSLambdaTrigger(
    val accessKey: CoreSecretKeySelector? = null,
    val functionName: String? = null,
    val invocationType: String? = null,
    val parameters: List<EvTriggerParameter>? = null,
    val payload: List<EvTriggerParameter>? = null,
    val region: String? = null,
    val roleARN: String? = null,
    val secretKey: CoreSecretKeySelector? = null
)
