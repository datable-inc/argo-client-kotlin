package jp.datable.argo.workflow.client.models.openapi

data class WfArtifactLocation(
    val archiveLogs: Boolean? = null,
    val artifactory: WfArtifactoryArtifact? = null,
    val azure: WfAzureArtifact? = null,
    val gcs: WfGCSArtifact? = null,
    val git: WfGitArtifact? = null,
    val hdfs: WfHDFSArtifact? = null,
    val http: WfHTTPArtifact? = null,
    val oss: WfOSSArtifact? = null,
    val raw: WfRawArtifact? = null,
    val s3: WfS3Artifact? = null
)
