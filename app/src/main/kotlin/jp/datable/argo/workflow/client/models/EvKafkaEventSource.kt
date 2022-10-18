package jp.datable.argo.workflow.client.models

data class EvKafkaEventSource(
    val config: String?,
    val connectionBackoff: EvBackoff?,
    val consumerGroup: EvKafkaConsumerGroup?,
    val filter: EvEventSourceFilter?,
    val jsonBody: Boolean?,
    val limitEventsPerSecond: String?,
    val metadata: Map<String, String>?,
    val partition: String?,
    val sasl: EvSASLConfig?,
    val tls: EvTLSConfig?,
    val topic: String?,
    val url: String?,
    val version: String?
)
