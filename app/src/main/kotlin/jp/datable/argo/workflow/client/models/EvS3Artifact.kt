package jp.datable.argo.workflow.client.models

data class EvS3Artifact(
    val accessKey: CoreSecretKeySelector?,
    val bucket: EvS3Bucket?,
    val endpoint: String?,
    val events: List<String>?,
    val filter: EvS3Filter?,
    val insecure: Boolean?,
    val metadata: Map<String, String>?,
    val region: String?,
    val secretKey: CoreSecretKeySelector?
)
