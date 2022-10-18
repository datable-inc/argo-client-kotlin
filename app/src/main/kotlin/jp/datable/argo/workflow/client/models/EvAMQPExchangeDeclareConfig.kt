package jp.datable.argo.workflow.client.models

data class EvAMQPExchangeDeclareConfig(
    val autoDelete: Boolean?,
    val durable: Boolean?,
    val `internal`: Boolean?,
    val noWait: Boolean?
)
