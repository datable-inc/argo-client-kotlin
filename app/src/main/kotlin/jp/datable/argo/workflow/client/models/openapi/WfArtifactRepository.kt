package jp.datable.argo.workflow.client.models.openapi

data class WfArtifactRepository(
    val archiveLogs: Boolean? = null,
    val artifactory: WfArtifactoryArtifactRepository? = null,
    val azure: WfAzureArtifactRepository? = null,
    val gcs: WfGCSArtifactRepository? = null,
    val hdfs: WfHDFSArtifactRepository? = null,
    val oss: WfOSSArtifactRepository? = null,
    val s3: WfS3ArtifactRepository? = null
)
