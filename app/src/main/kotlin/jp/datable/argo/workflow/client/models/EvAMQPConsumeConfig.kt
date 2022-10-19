package jp.datable.argo.workflow.client.models

data class EvAMQPConsumeConfig(
    val autoAck: Boolean? = null,
    val consumerTag: String? = null,
    val exclusive: Boolean? = null,
    val noLocal: Boolean? = null,
    val noWait: Boolean? = null
)
