package jp.datable.argo.workflow.client.models.openapi

data class EvKafkaConsumerGroup(
    val groupName: String? = null,
    val oldest: Boolean? = null,
    val rebalanceStrategy: String? = null
)
