package jp.datable.argo.workflow.client.models.openapi

data class EvKafkaTrigger(
    val compress: Boolean? = null,
    val flushFrequency: Int? = null,
    val parameters: List<EvTriggerParameter>? = null,
    val partition: Int? = null,
    val partitioningKey: String? = null,
    val payload: List<EvTriggerParameter>? = null,
    val requiredAcks: Int? = null,
    val sasl: EvSASLConfig? = null,
    val tls: EvTLSConfig? = null,
    val topic: String? = null,
    val url: String? = null,
    val version: String? = null
)
