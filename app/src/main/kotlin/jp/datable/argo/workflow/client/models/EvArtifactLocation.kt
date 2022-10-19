package jp.datable.argo.workflow.client.models

data class EvArtifactLocation(
    val configmap: CoreConfigMapKeySelector? = null,
    val file: EvFileArtifact? = null,
    val git: EvGitArtifact? = null,
    val `inline`: String? = null,
    val resource: EvResource? = null,
    val s3: EvS3Artifact? = null,
    val url: EvURLArtifact? = null
)
