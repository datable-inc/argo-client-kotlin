package jp.datable.argo.workflow.client.models

data class EvAMQPExchangeDeclareConfig(
    val autoDelete: Boolean? = null,
    val durable: Boolean? = null,
    val `internal`: Boolean? = null,
    val noWait: Boolean? = null
)
