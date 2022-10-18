package jp.datable.argo.workflow.client.models

data class WfContainerNode(
    val name: String,
    val args: List<String>?,
    val command: List<String>?,
    val dependencies: List<String>?,
    val env: List<CoreEnvVar>?,
    val envFrom: List<CoreEnvFromSource>?,
    val image: String?,
    val imagePullPolicy: String?,
    val lifecycle: CoreLifecycle?,
    val livenessProbe: CoreProbe?,
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
