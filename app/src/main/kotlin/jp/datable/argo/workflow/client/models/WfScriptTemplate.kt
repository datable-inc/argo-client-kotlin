package jp.datable.argo.workflow.client.models

data class WfScriptTemplate(
    val image: String,
    val source: String,
    val args: List<String>?,
    val command: List<String>?,
    val env: List<CoreEnvVar>?,
    val envFrom: List<CoreEnvFromSource>?,
    val imagePullPolicy: String?,
    val lifecycle: CoreLifecycle?,
    val livenessProbe: CoreProbe?,
    val name: String?,
    val ports: List<CoreContainerPort>?,
    val readinessProbe: CoreProbe?,
    val resources: CoreResourceRequirements?,
    val securityContext: CoreSecurityContext?,
    val startupProbe: CoreProbe?,
    val stdin: Boolean?,
    val stdinOnce: Boolean?,
    val terminationMessagePath: String?,
    val terminationMessagePolicy: String?,
    val tty: Boolean?,
    val volumeDevices: List<CoreVolumeDevice>?,
    val volumeMounts: List<CoreVolumeMount>?,
    val workingDir: String?
)
