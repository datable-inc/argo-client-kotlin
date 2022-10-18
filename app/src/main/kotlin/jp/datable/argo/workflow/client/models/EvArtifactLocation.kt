package jp.datable.argo.workflow.client.models

data class EvArtifactLocation(
    val configmap: CoreConfigMapKeySelector?,
    val file: EvFileArtifact?,
    val git: EvGitArtifact?,
    val `inline`: String?,
    val resource: EvResource?,
    val s3: EvS3Artifact?,
    val url: EvURLArtifact?
)
