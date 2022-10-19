package jp.datable.argo.workflow.client.models

data class CoreNFSVolumeSource(val path: String, val server: String, val readOnly: Boolean? = null)
