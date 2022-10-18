package jp.datable.argo.workflow.client.models

data class CoreContainer(
    val image: String,
    val args: List<String>?,
    val command: List<String>?,
    val env: List<CoreEnvVar>?,
    val envFrom: List<CoreEnvFromSource>?,
    val imagePullPolicy: ImagePullPolicy?,
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
    val terminationMessagePolicy: TerminationMessagePolicy?,
    val tty: Boolean?,
    val volumeDevices: List<CoreVolumeDevice>?,
    val volumeMounts: List<CoreVolumeMount>?,
    val workingDir: String?
) {

    /**
     * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is
     * specified, or IfNotPresent otherwise. Cannot be updated. More info:
     * https://kubernetes.io/docs/concepts/containers/images#updating-images Possible enum values: -
     * `\"Always\"` means that kubelet always attempts to pull the latest image. Container will fail
     * If the pull fails. - `\"IfNotPresent\"` means that kubelet pulls if the image isn't present on
     * disk. Container will fail if the image isn't present and the pull fails. - `\"Never\"` means
     * that kubelet never pulls an image, but only uses a local image. Container will fail if the
     * image isn't present
     *
     * Values: always,ifNotPresent,never
     */
    enum class ImagePullPolicy(val value: String) {
        always("Always"),
        ifNotPresent("IfNotPresent"),
        never("Never")
    }
    /**
     * Indicate how the termination message should be populated. File will use the contents of
     * terminationMessagePath to populate the container status message on both success and failure.
     * FallbackToLogsOnError will use the last chunk of container log output if the termination
     * message file is empty and the container exited with an error. The log output is limited to 2048
     * bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated. Possible enum
     * values: - `\"FallbackToLogsOnError\"` will read the most recent contents of the container logs
     * for the container status message when the container exits with an error and the
     * terminationMessagePath has no contents. - `\"File\"` is the default behavior and will set the
     * container status message to the contents of the container's terminationMessagePath when the
     * container exits.
     *
     * Values: fallbackToLogsOnError,file
     */
    enum class TerminationMessagePolicy(val value: String) {
        fallbackToLogsOnError("FallbackToLogsOnError"),
        file("File")
    }
}
