package jp.datable.argo.workflow.client.models

data class WfArtifactRepository(
    val archiveLogs: Boolean?,
    val artifactory: WfArtifactoryArtifactRepository?,
    val azure: WfAzureArtifactRepository?,
    val gcs: WfGCSArtifactRepository?,
    val hdfs: WfHDFSArtifactRepository?,
    val oss: WfOSSArtifactRepository?,
    val s3: WfS3ArtifactRepository?
)
