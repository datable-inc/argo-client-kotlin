package jp.datable.argo.workflow.client.models

data class CoreEnvVar(val name: String, val `value`: String?, val valueFrom: CoreEnvVarSource?)
