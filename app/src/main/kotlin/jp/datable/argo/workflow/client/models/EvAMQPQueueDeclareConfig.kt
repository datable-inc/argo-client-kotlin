package jp.datable.argo.workflow.client.models

data class EvAMQPQueueDeclareConfig(
    val arguments: String?,
    val autoDelete: Boolean?,
    val durable: Boolean?,
    val exclusive: Boolean?,
    val name: String?,
    val noWait: Boolean?
)
