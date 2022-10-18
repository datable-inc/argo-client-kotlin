package jp.datable.argo.workflow.client.models

data class EvKafkaTrigger(
    val compress: Boolean?,
    val flushFrequency: Int?,
    val parameters: List<EvTriggerParameter>?,
    val partition: Int?,
    val partitioningKey: String?,
    val payload: List<EvTriggerParameter>?,
    val requiredAcks: Int?,
    val sasl: EvSASLConfig?,
    val tls: EvTLSConfig?,
    val topic: String?,
    val url: String?,
    val version: String?
)
