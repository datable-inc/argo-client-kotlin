package jp.datable.argo.workflow.client.models

data class WfContainerNode(
    val name: String,
    val args: List<String>? = null,
    val command: List<String>? = null,
    val dependencies: List<String>? = null,
    val env: List<CoreEnvVar>? = null,
    val envFrom: List<CoreEnvFromSource>? = null,
    val image: String? = null,
    val imagePullPolicy: String? = null,
    val lifecycle: CoreLifecycle? = null,
    val livenessProbe: CoreProbe? = null,
    val ports: List<CoreContainerPort>? = null,
    val readinessProbe: CoreProbe? = null,
    val resources: CoreResourceRequirements? = null,
    val securityContext: CoreSecurityContext? = null,
    val startupProbe: CoreProbe? = null,
    val stdin: Boolean? = null,
    val stdinOnce: Boolean? = null,
    val terminationMessagePath: String? = null,
    val terminationMessagePolicy: String? = null,
    val tty: Boolean? = null,
    val volumeDevices: List<CoreVolumeDevice>? = null,
    val volumeMounts: List<CoreVolumeMount>? = null,
    val workingDir: String? = null
)
