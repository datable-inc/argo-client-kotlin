package jp.datable.argo.workflow.client.models

data class WfArtifactLocation(
    val archiveLogs: Boolean?,
    val artifactory: WfArtifactoryArtifact?,
    val azure: WfAzureArtifact?,
    val gcs: WfGCSArtifact?,
    val git: WfGitArtifact?,
    val hdfs: WfHDFSArtifact?,
    val http: WfHTTPArtifact?,
    val oss: WfOSSArtifact?,
    val raw: WfRawArtifact?,
    val s3: WfS3Artifact?
)
