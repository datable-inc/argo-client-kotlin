package jp.datable.argo.workflow.client.models

data class WfArtifactPaths(
    val name: String,
    val archive: WfArchiveStrategy?,
    val archiveLogs: Boolean?,
    val artifactGC: WfArtifactGC?,
    val artifactory: WfArtifactoryArtifact?,
    val azure: WfAzureArtifact?,
    val deleted: Boolean?,
    val from: String?,
    val fromExpression: String?,
    val gcs: WfGCSArtifact?,
    val git: WfGitArtifact?,
    val globalName: String?,
    val hdfs: WfHDFSArtifact?,
    val http: WfHTTPArtifact?,
    val mode: Int?,
    val optional: Boolean?,
    val oss: WfOSSArtifact?,
    val path: String?,
    val raw: WfRawArtifact?,
    val recurseMode: Boolean?,
    val s3: WfS3Artifact?,
    val subPath: String?
)
