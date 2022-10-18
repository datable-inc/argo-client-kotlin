package jp.datable.argo.workflow.client.models

data class EvKafkaConsumerGroup(
    val groupName: String?,
    val oldest: Boolean?,
    val rebalanceStrategy: String?
)
