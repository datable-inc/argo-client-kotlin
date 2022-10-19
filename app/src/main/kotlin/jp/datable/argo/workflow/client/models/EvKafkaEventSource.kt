package jp.datable.argo.workflow.client.models

data class EvKafkaEventSource(
    val config: String? = null,
    val connectionBackoff: EvBackoff? = null,
    val consumerGroup: EvKafkaConsumerGroup? = null,
    val filter: EvEventSourceFilter? = null,
    val jsonBody: Boolean? = null,
    val limitEventsPerSecond: String? = null,
    val metadata: Map<String, String>? = null,
    val partition: String? = null,
    val sasl: EvSASLConfig? = null,
    val tls: EvTLSConfig? = null,
    val topic: String? = null,
    val url: String? = null,
    val version: String? = null
)
