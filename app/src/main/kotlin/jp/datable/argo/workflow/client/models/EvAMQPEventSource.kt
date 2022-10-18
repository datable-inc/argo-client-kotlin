package jp.datable.argo.workflow.client.models

data class EvAMQPEventSource(
    val auth: EvBasicAuth?,
    val connectionBackoff: EvBackoff?,
    val consume: EvAMQPConsumeConfig?,
    val exchangeDeclare: EvAMQPExchangeDeclareConfig?,
    val exchangeName: String?,
    val exchangeType: String?,
    val filter: EvEventSourceFilter?,
    val jsonBody: Boolean?,
    val metadata: Map<String, String>?,
    val queueBind: EvAMQPQueueBindConfig?,
    val queueDeclare: EvAMQPQueueDeclareConfig?,
    val routingKey: String?,
    val tls: EvTLSConfig?,
    val url: String?,
    val urlSecret: CoreSecretKeySelector?
)
