package jp.datable.argo.workflow.client.models.openapi

data class EvAMQPQueueDeclareConfig(
    val arguments: String? = null,
    val autoDelete: Boolean? = null,
    val durable: Boolean? = null,
    val exclusive: Boolean? = null,
    val name: String? = null,
    val noWait: Boolean? = null
)
