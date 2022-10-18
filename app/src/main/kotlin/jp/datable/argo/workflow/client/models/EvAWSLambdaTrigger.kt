package jp.datable.argo.workflow.client.models

data class EvAWSLambdaTrigger(
    val accessKey: CoreSecretKeySelector?,
    val functionName: String?,
    val invocationType: String?,
    val parameters: List<EvTriggerParameter>?,
    val payload: List<EvTriggerParameter>?,
    val region: String?,
    val roleARN: String?,
    val secretKey: CoreSecretKeySelector?
)
