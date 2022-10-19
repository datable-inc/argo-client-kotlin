package jp.datable.argo.workflow.client.models.openapi

data class EvAMQPEventSource(
    val auth: EvBasicAuth? = null,
    val connectionBackoff: EvBackoff? = null,
    val consume: EvAMQPConsumeConfig? = null,
    val exchangeDeclare: EvAMQPExchangeDeclareConfig? = null,
    val exchangeName: String? = null,
    val exchangeType: String? = null,
    val filter: EvEventSourceFilter? = null,
    val jsonBody: Boolean? = null,
    val metadata: Map<String, String>? = null,
    val queueBind: EvAMQPQueueBindConfig? = null,
    val queueDeclare: EvAMQPQueueDeclareConfig? = null,
    val routingKey: String? = null,
    val tls: EvTLSConfig? = null,
    val url: String? = null,
    val urlSecret: CoreSecretKeySelector? = null
)
