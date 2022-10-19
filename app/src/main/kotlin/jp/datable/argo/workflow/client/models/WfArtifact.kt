package jp.datable.argo.workflow.client.models

data class WfArtifact(
    val name: String,
    val archive: WfArchiveStrategy? = null,
    val archiveLogs: Boolean? = null,
    val artifactGC: WfArtifactGC? = null,
    val artifactory: WfArtifactoryArtifact? = null,
    val azure: WfAzureArtifact? = null,
    val deleted: Boolean? = null,
    val from: String? = null,
    val fromExpression: String? = null,
    val gcs: WfGCSArtifact? = null,
    val git: WfGitArtifact? = null,
    val globalName: String? = null,
    val hdfs: WfHDFSArtifact? = null,
    val http: WfHTTPArtifact? = null,
    val mode: Int? = null,
    val optional: Boolean? = null,
    val oss: WfOSSArtifact? = null,
    val path: String? = null,
    val raw: WfRawArtifact? = null,
    val recurseMode: Boolean? = null,
    val s3: WfS3Artifact? = null,
    val subPath: String? = null
)
