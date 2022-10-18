package jp.datable.argo.workflow.client.models

data class EvEventSourceSpec(
    val amqp: EvAMQPEventSource?,
    val azureEventsHub: EvAzureEventsHubEventSource?,
    val bitbucket: EvBitbucketEventSource?,
    val bitbucketserver: EvBitbucketServerEventSource?,
    val calendar: EvCalendarEventSource?,
    val emitter: EvEmitterEventSource?,
    val eventBusName: String?,
    val file: EvFileEventSource?,
    val generic: EvGenericEventSource?,
    val github: EvGithubEventSource?,
    val gitlab: EvGitlabEventSource?,
    val hdfs: EvHDFSEventSource?,
    val kafka: EvKafkaEventSource?,
    val minio: EvS3Artifact?,
    val mqtt: EvMQTTEventSource?,
    val nats: EvNATSEventsSource?,
    val nsq: EvNSQEventSource?,
    val pubSub: EvPubSubEventSource?,
    val pulsar: EvPulsarEventSource?,
    val redis: EvRedisEventSource?,
    val redisStream: EvRedisStreamEventSource?,
    val replicas: Int?,
    val resource: EvResourceEventSource?,
    val service: EvService?,
    val slack: EvSlackEventSource?,
    val sns: EvSNSEventSource?,
    val sqs: EvSQSEventSource?,
    val storageGrid: EvStorageGridEventSource?,
    val stripe: EvStripeEventSource?,
    val template: EvTemplate?,
    val webhook: EvWebhookEventSource?
)