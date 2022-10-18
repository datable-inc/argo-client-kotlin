package jp.datable.argo.workflow.client.models

data class EvAMQPConsumeConfig(
    val autoAck: Boolean?,
    val consumerTag: String?,
    val exclusive: Boolean?,
    val noLocal: Boolean?,
    val noWait: Boolean?
)
