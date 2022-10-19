package jp.datable.argo.workflow.client.models.openapi

data class EvS3Artifact(
    val accessKey: CoreSecretKeySelector? = null,
    val bucket: EvS3Bucket? = null,
    val endpoint: String? = null,
    val events: List<String>? = null,
    val filter: EvS3Filter? = null,
    val insecure: Boolean? = null,
    val metadata: Map<String, String>? = null,
    val region: String? = null,
    val secretKey: CoreSecretKeySelector? = null
)
